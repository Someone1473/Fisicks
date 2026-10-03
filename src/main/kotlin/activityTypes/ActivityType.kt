package main.activityTypes
import kotlinx.serialization.Serializable

@Serializable
data class ActivityType(val name: String, val type: String, val subject: String, val origin: String, val points: Int)
