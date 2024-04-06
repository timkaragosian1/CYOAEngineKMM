package data.models

data class UserAction (
    var isStartOfGame: Boolean = true,
    var isEndOfGame: Boolean = false,
    var eventIdCurrent: Int,
    var eventIdNext: Int?,
    var notes: String?,
    var timestamp: Long,
)