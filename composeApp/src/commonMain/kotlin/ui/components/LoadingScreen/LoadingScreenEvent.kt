package ui.components.LoadingScreen

sealed interface LoadingScreenEvent {
    data object onLoadComplete: LoadingScreenEvent
}