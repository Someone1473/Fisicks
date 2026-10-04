import kotlinx.serialization.json.Json

val customJson = Json {
    allowSpecialFloatingPointValues = true
}