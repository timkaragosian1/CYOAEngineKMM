package ui.components.ViewModels

import com.arkivanov.decompose.ComponentContext
import ui.components.CreditsScreenEvent

class CreditsScreenComponent(
    componentContext: ComponentContext,
    private val onNavigateBackToTitleScreen: () -> Unit
): ComponentContext by componentContext {
    fun onEvent(event: CreditsScreenEvent){
        when(event){
            CreditsScreenEvent.ClickBackToTitleScreenButton -> onNavigateBackToTitleScreen()
        }
    }
}