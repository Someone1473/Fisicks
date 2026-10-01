import java.time.LocalDate
import activityTypes.*

class Activity {
    val date = LocalDate.now()
    var plannedActivities: List<ActivityType> = listOf()
    var finishedActivities: List<ActivityType> = listOf()
    var finished = false
    var plannedNetPoints = 0
    var finishedNetPoints = 0
    var actualNetPoints = 0

    private fun count(listOfActivities: List<ActivityType>): Int{

        var answer = 0

        for (i in listOfActivities){
            answer += i.points
        }

        return answer
    }


    fun plan(plannedActivityNot: List<ActivityType>){
        plannedActivities = plannedActivityNot
        plannedNetPoints = this.count(plannedActivities)

    }

    fun review(finishedActivitesNot: List<ActivityType>){
        finishedActivities = finishedActivitesNot
        finishedNetPoints = this.count(finishedActivities)
        actualNetPoints = finishedNetPoints - (plannedNetPoints - finishedNetPoints).div(5)
        finished = true

    }

}