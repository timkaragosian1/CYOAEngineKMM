package data.models

data class UserActions (
    var isStartOfGame: Boolean = true,
    var isEndOfGame: Boolean = false,
    var eventIdCurrent: Int,
    var eventIdNext: Int?,
    var notes: String?,
    var timestamp: Long,
)