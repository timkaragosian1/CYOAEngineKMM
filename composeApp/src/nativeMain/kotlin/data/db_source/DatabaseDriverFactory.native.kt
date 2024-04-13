package data.db_source

import app.cash.sqldelight.db.SqlDriver
import db.cCommerceDatabase

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(cCommerceDatabase.Schema, "cCommerceDatabase.db")
    }
}
