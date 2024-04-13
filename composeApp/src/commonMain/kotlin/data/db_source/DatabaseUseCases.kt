package data.db_source

import data.data_utils.Resource

class DatabaseUseCases(
    private val userActionDbDataSource: UserActionDbDataSource
) {
    suspend fun executeInsert(
        uuid: String,
        eventId: Long,
        notes: String,
        timestamp: Long
    ): Resource<String>{
        return try {
            userActionDbDataSource.insertUserAction(
                UserActionItem(
                    id = null,
                    uuid = uuid,
                    eventId = eventId,
                    notes = notes,
                    timestamp = timestamp
                )
            )

            Resource.Success("insert_complete")
        } catch (e: Exception){
            e.printStackTrace()
            Resource.Error(e)
        }
    }
}