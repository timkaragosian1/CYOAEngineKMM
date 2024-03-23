package ui.components.ViewModels

import com.arkivanov.decompose.ComponentContext
import ui.components.TitleScreenEvent

class TitleScreenComponent(
    componentContext: ComponentContext,
    private val onNavigateToCreditsScreen: () -> Unit,
    private val onNavigateToGameScreen: () -> Unit
): ComponentContext by componentContext {
    fun onEvent(event: TitleScreenEvent){
        when(event){
            TitleScreenEvent.ClickCreditsButton -> onNavigateToCreditsScreen()
            is TitleScreenEvent.ClickStartGameButton -> onNavigateToGameScreen()
        }
    }
}