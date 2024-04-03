package ui.components.GameOverStory

sealed interface GameOverStoryEvent {
    data object ClickBackToTitleScreenButton: GameOverStoryEvent
}