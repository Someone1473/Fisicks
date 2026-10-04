import kotlinx.datetime.LocalDate
import main.activityTypes.ActivityType
import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
class Session {
    var date = LocalDate.parse("0067-6-7")
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


    fun plan(plannedActivityInput: List<ActivityType>, SessionDate: LocalDate){
        plannedActivities = plannedActivityInput
        plannedNetPoints = this.count(plannedActivities)
        date = SessionDate

    }

    fun review(finishedActivitiesNot: List<ActivityType>){
        finishedActivities = finishedActivitiesNot
        finishedNetPoints = this.count(finishedActivities)
        actualNetPoints = finishedNetPoints - (plannedNetPoints - finishedNetPoints).div(5)
        finished = true

    }

}