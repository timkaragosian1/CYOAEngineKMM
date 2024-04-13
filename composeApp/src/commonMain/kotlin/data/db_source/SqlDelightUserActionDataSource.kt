package data.db_source

import app.cash.sqldelight.coroutines.asFlow
import app.cash.sqldelight.coroutines.mapToList
import db.cCommerceDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.datetime.Clock

class SqlDelightUserActionDataSource(
    db: cCommerceDatabase
):UserActionDbDataSource {
    val queries = db.userActionsEntityQueries
    override fun getAllUserActions(): Flow<List<UserActionItem>> {
        return queries
            .getAllUserActions()
            .asFlow()
            .mapToList(Dispatchers.IO)
            .map {userAction ->
                userAction.map { it.toUserActionItem() }
            }
    }

    override suspend fun insertUserAction(userActionItem: UserActionItem) {
        queries.insertUserAction(
            id = userActionItem.id,
            gameUuid = userActionItem.uuid,
            eventId = userActionItem.eventId,
            notes = userActionItem.notes,
            timestamp = Clock.System.now().toEpochMilliseconds()
        )
    }
}