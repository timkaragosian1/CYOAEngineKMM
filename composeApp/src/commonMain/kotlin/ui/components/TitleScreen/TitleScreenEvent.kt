package ui.components.TitleScreen

sealed interface TitleScreenEvent {
    data object ClickCreditsButton: TitleScreenEvent
    data object ClickStartGameButton: TitleScreenEvent
}