import customErrors.InvalidCompException
import kotlinx.datetime.LocalDate
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import java.io.File

@Serializable
class Goal {
    var goal = ""
    var goalDate = LocalDate.parse("1067-06-07")
    var goalCareerPoints = 0



    fun preset(comp: String) {
        if (comp == "ipho") {
            goal = "IPhO"
            goalDate = LocalDate.parse("2028-07-01")
            goalCareerPoints = 6000

        } else if (comp == "apho") {
            goal = "APhO"
            goalDate = LocalDate.parse("2028-05-01")
            goalCareerPoints = 5000

        } else if (comp == "aupho") {
            goal = "AuPhO"
            goalDate = LocalDate.parse("2027-06-27")
            goalCareerPoints = 3600
        } else {
            throw InvalidCompException("Please enter a valid competition.")
        }
    }

    fun saveGoal(){
        var theFile = File("src/main/data/goalData.json")
        theFile.writeText(Json.encodeToString(this))
    }

    fun loadGoal(){
        var theFile = File("src/main/data/goalData.json")
        val input = theFile.readText()
        val loadedGoal = Json.decodeFromString<Goal>(input)
        this.goal = loadedGoal.goal
        this.goalDate = loadedGoal.goalDate
        this.goalCareerPoints = loadedGoal.goalCareerPoints


    }



}