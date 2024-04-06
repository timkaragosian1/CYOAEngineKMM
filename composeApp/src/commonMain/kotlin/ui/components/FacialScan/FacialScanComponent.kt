package ui.components.FacialScan

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue

class FacialScanComponent(
    componentContext: ComponentContext,
    private val onNavigateToGameScreen: () -> Unit,
): ComponentContext by componentContext {
    var facialScanTextProgress = MutableValue("")
    var downloadUserDataTextProgress = MutableValue("")
    fun onTimerEnd(){
        onNavigateToGameScreen()
    }
}