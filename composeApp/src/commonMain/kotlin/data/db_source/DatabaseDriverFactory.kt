package data.db_source

import app.cash.sqldelight.db.SqlDriver
import db.cCommerceDatabase


expect class DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}

fun createDatabase(driverFactory: DatabaseDriverFactory): cCommerceDatabase {
    val driver = driverFactory.createDriver()
    val database = cCommerceDatabase(driver)

    // Do more work with the database (see below).
    return database
}