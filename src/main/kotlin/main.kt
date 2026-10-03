package main
import Goal
import PhysCalendar
import User

import java.io.File

fun main(){

    println("Fisicks (Pre-Alpha)")
    println("--------------------------")

    var theUser = User()
    var thePhysCalendar = PhysCalendar()
    var theGoal = Goal()

    while (true)

        var command = ""

        command = readln()


        if (command == "loadAll"){

        } else if (command == "addSession"){

        } else if (command == "reviewSession"){

        } else if (command == "buyStreakFreeze"){

        } else if (command == "checkTodayActiviy"){

        } else if (command == "checkYesterdayActivity"){

        } else{
            println("insert a valid command dummy")
        }

    //TODO: The point checks and stuff



}