package ui.components.ViewModels

import com.arkivanov.decompose.ComponentContext

class FacialScanComponent(
    componentContext: ComponentContext,
    private val onNavigateToGameScreen: () -> Unit,
): ComponentContext by componentContext {

    fun onTimerEnd(){
        onNavigateToGameScreen()
    }
}