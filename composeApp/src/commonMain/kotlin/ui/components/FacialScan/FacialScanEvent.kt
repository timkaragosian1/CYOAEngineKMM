package ui.components.FacialScan

sealed interface FacialScanEvent {
    data object OnTimerToNextSceen: FacialScanEvent
}