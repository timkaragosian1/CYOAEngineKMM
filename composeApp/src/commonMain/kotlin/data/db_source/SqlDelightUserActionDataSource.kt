package data.db_source

import db.cCommerceDatabase
import kotlinx.datetime.Clock

class SqlDelightUserActionDataSource(
    db: cCommerceDatabase
):UserActionDbDataSource {
    val queries = db.userActionsEntityQueries
    override suspend fun getAllUserActions(): ArrayList<UserActionItem> {

        var result = ArrayList<UserActionItem>()

        var queryResult =  queries.getAllUserActions().executeAsList()

        return result
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