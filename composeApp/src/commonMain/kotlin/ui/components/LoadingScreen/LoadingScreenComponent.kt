package ui.components.LoadingScreen

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.EmptyCoroutineContext


class LoadingScreenComponent(
    componentContext: ComponentContext,
    private val onLoadingComplete: () -> Unit,
    startingLoadProgressText:String
): ComponentContext by componentContext {
    var _loadingProgressText = MutableValue(startingLoadProgressText)
    val loadingProgressText: Value<String> = _loadingProgressText

    val loadNextScreenTimer = CoroutineScope(EmptyCoroutineContext).launch() {
        delay(800)
        withContext(Dispatchers.Main) {
            onLoadDataComplete()
        }
    }

    val incrementTextTimer = CoroutineScope(EmptyCoroutineContext).launch() {
        while (_loadingProgressText.value.length <= 26) {
            delay(1000)
            if (_loadingProgressText.value.length < 25) {
                _loadingProgressText.value = _loadingProgressText.value + "."
            } else if (_loadingProgressText.value.length > 25) {
                _loadingProgressText.value = _loadingProgressText.value + "COMPLETE!"
                withContext(Dispatchers.Main){
                    loadNextScreenTimer.start()
                }
            }
        }
    }


    fun loadMockedProgress(){
        incrementTextTimer.start()
    }

    fun onLoadDataComplete(){
        onLoadingComplete()
    }
}