package ui.components.TitleScreen

import com.arkivanov.decompose.ComponentContext
import ui.components.TitleScreen.TitleScreenEvent

class TitleScreenComponent(
    componentContext: ComponentContext,
    private val onNavigateToCreditsScreen: () -> Unit,
    private val onNavigateToNamesGameStartScreen: () -> Unit
): ComponentContext by componentContext {
    fun onEvent(event: TitleScreenEvent){
        when(event){
            TitleScreenEvent.ClickCreditsButton -> onNavigateToCreditsScreen()
            is TitleScreenEvent.ClickStartGameButton -> onNavigateToNamesGameStartScreen()
        }
    }
}