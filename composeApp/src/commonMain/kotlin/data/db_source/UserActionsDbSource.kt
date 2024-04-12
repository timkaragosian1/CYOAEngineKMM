package data.db_source

import db.UserActionsEntity
import kotlinx.coroutines.flow.Flow

interface UserActionsDbSource {
    suspend fun insertUserAction(
        id: Long?,
        gameUuid: String,
        eventId: Long,
        notes: String,
        timestamp: Long,
    )
    fun getAllUserActions(): Flow<List<UserActionsEntity>>
    suspend fun deleteAllUserActions()
    suspend fun deleteUserActionById(id: Long)
}