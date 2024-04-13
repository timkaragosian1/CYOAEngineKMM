package data.db_source

import kotlinx.coroutines.flow.Flow

interface UserActionDbDataSource {
    fun getAllUserActions():Flow<List<UserActionItem>>

    suspend fun insertUserAction(userActionItem: UserActionItem)
}