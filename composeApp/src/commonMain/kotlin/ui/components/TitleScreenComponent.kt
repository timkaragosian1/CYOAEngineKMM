package ui.components

import com.arkivanov.decompose.ComponentContext

class TitleScreenComponent(
    componentContext: ComponentContext,
    private val onNavigateToCreditsScreen: () -> Unit,
    private val onNavigateToGameScreen: () -> Unit
): ComponentContext by componentContext {
    fun onEvent(event:TitleScreenEvent){
        when(event){
            TitleScreenEvent.ClickCreditsButton -> onNavigateToCreditsScreen()
            is TitleScreenEvent.ClickStartGameButton -> onNavigateToGameScreen()
        }
    }
}