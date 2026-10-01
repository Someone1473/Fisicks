import java.time.LocalDate
import activityTypes.*

class Activity {
    val date = LocalDate.now()
    var activities: List<activityType> = listOf()
    var finished = false
    var netPoints = 0

    private fun count(): Int{

        for (i in activities){
            netPoints += i.points
        }

        return netPoints
    }


    fun plan(){

    }

    fun review(){

    }

}