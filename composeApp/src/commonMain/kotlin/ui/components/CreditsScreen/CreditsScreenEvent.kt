package ui.components.CreditsScreen

sealed interface CreditsScreenEvent {
    data object ClickBackToTitleScreenButton: CreditsScreenEvent
}