package data.db_source

data class UserActionItem(
    val id: Long?,
    val uuid: String,
    val eventId: Long,
    val notes: String,
    val timestamp: Long
)
