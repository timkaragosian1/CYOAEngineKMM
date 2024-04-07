package data

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

class GameDateUtils {
    //epoch to datetime string

    //get lossy day +/- 45 days from adventure time

    //set start date of adventure

    //set company start date

    //increment adventure time add 6 months

    private var _gameTimeMillis = MutableValue(0L)
    val gameTimeMillis:Value<Long> = _gameTimeMillis

    val monthMillis: Long = 2629743000

    fun epochMillisToFormattedString(millisTime: Long = _gameTimeMillis.value):String{
        return Instant.fromEpochMilliseconds(millisTime).toLocalDateTime(TimeZone.UTC).date.toString()
    }

    fun setStartAdventureGameTime(){
        _gameTimeMillis.value = getLossyTime(5212207700000, 2)
    }

    fun incrementGameTime(){

    }

    fun getLossyTime(millisTime:Long, months:Int? = 1):Long{
        val lossyAmount = months?.times(monthMillis)
        return millisTime + (-lossyAmount!!..lossyAmount).random()
    }
}