package ui.components

sealed interface NamesSelectScreenEvent {
    data object ClickSubmitNamesButton: NamesSelectScreenEvent
}