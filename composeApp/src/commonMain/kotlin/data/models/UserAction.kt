package data.models

data class UserAction (
    var gameUUID: String,
    var currentEventId: Int,
    var notes: String,
    var timestamp: Long,
)