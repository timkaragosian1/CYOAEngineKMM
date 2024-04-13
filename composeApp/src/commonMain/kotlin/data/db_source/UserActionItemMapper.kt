package data.db_source

import db.UserActionsEntity

fun UserActionsEntity.toUserActionItem(): UserActionItem {
    return UserActionItem(
        id = id,
        uuid = gameUuid,
        eventId = eventId,
        notes = notes,
        timestamp = timestamp
    )
}