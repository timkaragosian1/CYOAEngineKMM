package ui.components

sealed interface GameSpaceScreenEvent {
    data object ClickButton1: GameSpaceScreenEvent
    data object ClickButton2: GameSpaceScreenEvent
    data object ClickButton3: GameSpaceScreenEvent
    data object ClickButton4: GameSpaceScreenEvent
    data object ClickButton5: GameSpaceScreenEvent
    data object ClickButton6: GameSpaceScreenEvent

}