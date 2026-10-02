import main.customErrors.InsufficientPointsException
import java.time.LocalDate

class User {
    var name = ""
    var longestStreak = 0
    var points = 0
    var streak = 0
    var streakFreezes = 0
    var monthlyPoints = 0
    var monthlyPointsGoal = 0
    var dateOfLastActivity = LocalDate.parse("0067--06--07")
    val streakFreezePrice = 50

    var careerPoints = 0

    fun findStreak(){

    }

    fun updateLongestStreak(){
        if (streak > longestStreak){
            longestStreak = streak
        }
    }

    fun addPoints(newActivity: Activity){
        if (dateOfLastActivity.year == newActivity.date.year && dateOfLastActivity.month == newActivity.date.month){
            monthlyPoints += newActivity.actualNetPoints
        } else{
            monthlyPoints = newActivity.actualNetPoints
        }
        points += newActivity.actualNetPoints
        careerPoints += newActivity.actualNetPoints
    }

    fun buyStreakFreeze(amount: Int){
        if (points > streakFreezePrice * amount){
            points -= streakFreezePrice * amount
            streakFreezes += amount
        }
        else{
            throw InsufficientPointsException("u dumb git gud")
        }
    }

    fun monthlyPointsGoalRewardCheck(): Boolean {
        if (monthlyPoints >= monthlyPointsGoal) {
            points += monthlyPointsGoal.div(4)
            return true
        } else {
            return false
        }

    }

    fun saveUser(){}

    fun loadUser(){}

}

