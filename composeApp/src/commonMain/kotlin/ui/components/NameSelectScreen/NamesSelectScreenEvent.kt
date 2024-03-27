package ui.components.NameSelectScreen

sealed interface NamesSelectScreenEvent {
    data object ClickSubmitNamesButton: NamesSelectScreenEvent
}