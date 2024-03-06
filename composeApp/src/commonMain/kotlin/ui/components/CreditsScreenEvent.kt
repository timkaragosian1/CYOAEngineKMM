package ui.components

sealed interface CreditsScreenEvent {
    data object ClickBackToTitleScreenButton: CreditsScreenEvent
}