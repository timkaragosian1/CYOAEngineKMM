package ui.components.GameScreen

sealed interface GameScreenEvent {
    data object ClickButton1: GameScreenEvent
    data object ClickButton2: GameScreenEvent
    data object ClickButton3: GameScreenEvent
    data object ClickButton4: GameScreenEvent
    data object ClickButton5: GameScreenEvent
    data object ClickButton6: GameScreenEvent
    data object AddGameStory: GameScreenEvent
    data object AddUserAction: GameScreenEvent
}