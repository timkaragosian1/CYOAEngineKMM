package data.models

data class UserActions (
    var id: Int,
    var isStartOfGame: Boolean = true,
    var isEndOfGame: Boolean = false,
    var eventIdCurrent: Int,
    var eventIdNext: Int?,
    var timestamp: String
)