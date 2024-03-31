package ui

sealed interface LoadingScreenEvent {
    data object onLoadComplete: LoadingScreenEvent
}