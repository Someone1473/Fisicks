import java.time.LocalDate

class User {
    var name = ""
    var longestStreak = 0
    var points = 0
    var streak = 0
    var streakFreezes = 0
    var monthlyPoints = 0
    var monthlyPointsGoal = 0
    var goal = ""
    var goalDate = LocalDate.parse("2026--07--04")
    var dateOfLastActivity = LocalDate.parse("0067--06--07")

    fun findStreak(){

    }

    fun updateLongestStreak(){

    }

    fun addPoints(newActivity: Activity){
        if (dateOfLastActivity.year == newActivity.date.year && dateOfLastActivity.month == newActivity.date.month){
            monthlyPoints += newActivity.netPoints
        } else{
            monthlyPoints = newActivity.netPoints
        }
    }

    fun buyStreakFreeze(){

    }




}