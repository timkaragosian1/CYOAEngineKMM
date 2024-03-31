package ui.ui_utils

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.coroutines.EmptyCoroutineContext

class GameTimer(val updateInterface: (Int) -> Unit) {
    private var timer: Job? = null

    fun startOnce(delayMillis:Long) {
        val callback = updateInterface
        timer = CoroutineScope(EmptyCoroutineContext).launch {
            repeat(1) {
                delay(delayMillis)
                callback(it)
            }
        }
    }

    fun startRepeat(delayMillis:Long, repeatTimes:Int) {
        val callback = updateInterface
        timer = CoroutineScope(EmptyCoroutineContext).launch {
            repeat(repeatTimes) {
                delay(delayMillis)
                callback(it)
            }
            //callback(repeatTimes)
        }
    }

    fun stop() {
        timer?.cancel()
    }
}