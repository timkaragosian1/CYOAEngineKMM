package data.db_source

interface UserActionDbDataSource {
    suspend fun getAllUserActions():ArrayList<UserActionItem>
    suspend fun insertUserAction(userActionItem: UserActionItem)
}