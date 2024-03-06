package ui.components

sealed interface TitleScreenEvent {
    data object ClickCreditsButton: TitleScreenEvent
    data object ClickStartGameButton: TitleScreenEvent
}