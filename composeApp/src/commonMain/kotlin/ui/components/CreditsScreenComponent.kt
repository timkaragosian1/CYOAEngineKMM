package ui.components

import com.arkivanov.decompose.ComponentContext

class CreditsScreenComponent(
    componentContext: ComponentContext,
    private val onNavigateBackToTitleScreen: () -> Unit
): ComponentContext by componentContext {
    fun onEvent(event:CreditsScreenEvent){
        when(event){
            CreditsScreenEvent.ClickBackToTitleScreenButton -> onNavigateBackToTitleScreen()
        }
    }
}