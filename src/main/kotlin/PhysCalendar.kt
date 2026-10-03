import kotlinx.datetime.LocalDate
import kotlinx.serialization.json.Json
import main.activityTypes.ActivityType
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import java.io.File

@Serializable
class PhysCalendar {

    var calendar: MutableMap<LocalDate, Session> = mutableMapOf()

    fun addSession(plannedActivityNot: List<ActivityType>, SessionDate: LocalDate){
        var newSession = Session()
        newSession.plan(plannedActivityNot, SessionDate)
        calendar.put(SessionDate, newSession)

    }

    fun reviewSession(finishedActivitiesNot: List<ActivityType>, SessionDate: LocalDate){
        var oldSession: Session? = null
        oldSession = calendar.get(SessionDate)

        if (oldSession == null){
            throw Exception()
        } else if (oldSession.finished == true){

        } else {
            oldSession.review(finishedActivitiesNot)
        }

    }

    fun checkTodayActivity(){}

    fun checkTommorowActivity(){}

    fun saveGoal(){
        var theFile = File("src/main/data/physCalendarData.json")
        theFile.writeText(Json.encodeToString(this))
    }

    fun loadGoal() {
        var theFile = File("src/main/data/physCalendarData.json")
        val input = theFile.readText()
        val loadedPhysCalendar = Json.decodeFromString<PhysCalendar>(input)
        this.calendar = loadedPhysCalendar.calendar

    }


}