import customErrors.SessionAmountException
import kotlinx.datetime.LocalDate
import main.activityTypes.ActivityType
import kotlinx.serialization.*
import java.io.File
import kotlin.time.Clock
import kotlinx.datetime.*

@Serializable
class PhysCalendar {

    var calendar: MutableMap<LocalDate, Session> = mutableMapOf()

    fun addSession(plannedActivityNot: List<ActivityType>, SessionDate: LocalDate){
        val today: LocalDate = Clock.System.todayIn(TimeZone.currentSystemDefault())

        if (calendar.get(today) == null){
            var newSession = Session()
            newSession.plan(plannedActivityNot, SessionDate)
            calendar.put(SessionDate, newSession)

        } else {
            throw SessionAmountException("You already have a session planned today.")
        }

    }

    fun reviewSession(finishedActivities: List<ActivityType>, SessionDate: LocalDate){
        var oldSession: Session? = null
        oldSession = calendar.get(SessionDate)

        if (oldSession == null){
            throw Exception()
        } else if (oldSession.finished == true){

        } else {
            oldSession.review(finishedActivities)
        }

    }

    fun checkTodaySession(): Session? {
        val today: LocalDate = Clock.System.todayIn(TimeZone.currentSystemDefault())
        var todaySession = calendar.get(today)
        if (todaySession == null){
            return null

        } else{
            return todaySession
        }

    }

    fun saveCalendar(){
        var theFile = File("src/main/data/physCalendarData.json")
        theFile.writeText(customJson.encodeToString(this))
    }

    fun loadCalendar() {
        var theFile = File("src/main/data/physCalendarData.json")
        val input = theFile.readText()
        val loadedPhysCalendar = customJson.decodeFromString<PhysCalendar>(input)
        this.calendar = loadedPhysCalendar.calendar

    }


}