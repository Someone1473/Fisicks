import customErrors.MultipleSessionReviewException
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

        if (calendar.get(SessionDate) == null){
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
            throw SessionAmountException("There is no session to review.")

        } else if (oldSession.finished == true){
            throw MultipleSessionReviewException("This session has already been reviewed, you aren't allowed to review it twice.")

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