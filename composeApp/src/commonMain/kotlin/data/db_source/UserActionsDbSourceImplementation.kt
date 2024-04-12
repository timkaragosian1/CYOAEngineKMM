package data.db_source

import app.cash.sqldelight.coroutines.asFlow
import app.cash.sqldelight.coroutines.mapToList
import db.UserActionsEntity
import db.cCommerceDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class UserActionsDbSourceImplementation(
    userActionDb:cCommerceDatabase
): UserActionsDbSource {

    private val queries = userActionDb.userActionsEntityQueries
    override suspend fun insertUserAction(
        id: Long?,
        gameUuid: String,
        eventId: Long,
        notes: String,
        timestamp: Long,
    ) {
        return withContext(Dispatchers.IO){
            queries.insertUserAction(
                id = id,
                gameUuid = gameUuid,
                eventId = eventId,
                notes = notes,
                timestamp = timestamp

            )
        }
    }

    override fun getAllUserActions(): Flow<List<UserActionsEntity>> {
        return queries.getAllUserActions().asFlow().mapToList(Dispatchers.IO)
    }

    override suspend fun deleteAllUserActions() {
        return queries.deleteAllUserActions()
    }

    override suspend fun deleteUserActionById(id: Long) {
        return queries.deleteUserActionById(id)
    }
}