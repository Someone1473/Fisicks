package main
import Goal
import PhysCalendar
import Session
import User
import activityTypes.allActivities
import customErrors.InvalidCompException
import customErrors.MultipleSessionReviewException
import customErrors.SessionAmountException
import kotlinx.datetime.LocalDate
import main.activityTypes.ActivityType
import main.customErrors.InsufficientPointsException

fun main(){
    var theUser = User()
    var thePhysCalendar = PhysCalendar()
    var theGoal = Goal()
    var command: String
    var inputtedDate: LocalDate
    var activities = listOf<String>()
    var userActivityInput: ActivityType?
    var activitiesButCorrectType = mutableListOf<ActivityType>()
    var todaySession: Session?
    var numberOfStreakFreezes: Any?
    var userGoal: Any?
    var session: Session?

    println("Fisicks (Pre-Alpha)")
    println("--------------------------------------------------------")
    println("Streak: ${theUser.streak}    Points: ${theUser.points}    Career Points: ${theUser.careerPoints}    Goal: ${theGoal.goal}")
    println("--------------------------------------------------------")

    while (true) {

        command = readln()

        if (command == "loadAll") {
            thePhysCalendar.loadCalendar()
            theGoal.loadGoal()
            theUser.loadUser()

        } else if (command == "addSession") {
            command = readln()
            activities = command.split(" ")

            for (i in activities){
                userActivityInput = allActivities.get(i)
                if (userActivityInput != null){
                    activitiesButCorrectType.add(userActivityInput)
                } else {
                    println("IllegalArgumentException: Please enter in valid activity names, each one separated by a space.")
                }
            }

            try {
                inputtedDate = LocalDate.parse(readln())
                thePhysCalendar.addSession(activitiesButCorrectType, inputtedDate)

            } catch(e: IllegalArgumentException){
                println("IllegalArgumentException: Please type in a date of format of yyyy-mm-dd.")
            }


        } else if (command == "reviewSession") {

            command = readln()
            activities = command.split(" ")

            for (i in activities){
                userActivityInput = allActivities.get(i)
                if (userActivityInput != null){
                    activitiesButCorrectType.add(userActivityInput)
                } else {
                    println("IllegalArgumentException: Please enter in valid activity names, each one separated by a space.")
                }
            }

            try {
                inputtedDate = LocalDate.parse(readln())
                try {
                    session = thePhysCalendar.calendar.get(inputtedDate)
                    if (session != null) {
                        thePhysCalendar.reviewSession(activitiesButCorrectType, inputtedDate)
                        theUser.addPoints(session)
                    } else {
                        println("SessionAmountException: There is no session to review.")
                    }
                } catch (e: SessionAmountException){
                    println("SessionAmountException: ${e.message}")
                } catch (e: MultipleSessionReviewException) {
                    println("MultipleSessionReviewException: ${e.message}")
                }

            } catch(e: IllegalArgumentException){
                println("IllegalArgumentException: Please type in a date of format of yyyy-mm-dd.")
            }


        } else if (command == "checkTodaySession") {

            todaySession = thePhysCalendar.checkTodaySession()

            if (todaySession == null){
                println("There is no session planned today.")

            } else {
                println("You have these activities today: ${todaySession.plannedActivities}")

            }

        } else if (command == "buyStreakFreeze") {

            numberOfStreakFreezes = readln()

            try{
                numberOfStreakFreezes = numberOfStreakFreezes.toInt()
                try{
                    theUser.buyStreakFreeze(numberOfStreakFreezes)

                } catch(e: InsufficientPointsException){
                    println("InsufficientPointsException: ${e.message}")
                }
            } catch (e: NumberFormatException){
                println("NumberFormatException: ${e.message}, please enter a integer")
            }


        } else if (command == "setGoal") {
            userGoal = readln()

            if (userGoal is String){
                userGoal.lowercase()
                try {
                    theGoal.preset(userGoal)
                } catch(e: InvalidCompException){
                    println(e.message)
                }

            } else {
                println("Please enter in a string")
            }

        } else {
            println("Please insert a valid command.")
        }

        theGoal.saveGoal()
        thePhysCalendar.saveCalendar()
        theUser.saveUser()
        theUser.findStreak(thePhysCalendar)

        println("--------------------------------------------------------")
        println("Streak: ${theUser.streak}    Points: ${theUser.points}    Career Points: ${theUser.careerPoints}    Goal: ${theGoal.goal}")
        println("--------------------------------------------------------")
    }

}