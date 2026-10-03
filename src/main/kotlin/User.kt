import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import main.customErrors.InsufficientPointsException
import java.io.File
import kotlinx.datetime.LocalDate

@Serializable
class User {
    var name = ""
    var longestStreak = 0
    var points = 0
    var streak = 0
    var streakFreezes = 0
    var monthlyPoints = 0
    var monthlyPointsGoal = 0
    var dateOfLastActivity = LocalDate.parse("0067-06-07")
    var streakFreezePrice = 50

    var careerPoints = 0

    fun findStreak(){

    }

    fun updateLongestStreak(){
        if (streak > longestStreak){
            longestStreak = streak
        }
    }

    fun addPoints(newSession: Session){
        if (dateOfLastActivity.year == newSession.date.year && dateOfLastActivity.month == newSession.date.month){
            monthlyPoints += newSession.actualNetPoints
        } else{
            monthlyPoints = newSession.actualNetPoints
        }
        points += newSession.actualNetPoints
        careerPoints += newSession.actualNetPoints
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

    fun saveUser(){
        var theFile = File("src/main/data/userData.json")
        theFile.writeText(Json.encodeToString(this))
    }

    fun loadUser(){
        var theFile = File("src/main/data/userData.json")
        val input = theFile.readText()
        val loadedUser = Json.decodeFromString<User>(input)
        this.careerPoints = loadedUser.careerPoints
        this.name = loadedUser.name
        this.points = loadedUser.points
        this.streak = loadedUser.streak
        this.streakFreezes = loadedUser.streakFreezes
        this.monthlyPoints = loadedUser.monthlyPoints
        this.monthlyPointsGoal = loadedUser.monthlyPointsGoal
        this.dateOfLastActivity = loadedUser.dateOfLastActivity
        this.streakFreezePrice = loadedUser.streakFreezePrice



    }

}

