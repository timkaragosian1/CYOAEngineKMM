@file:OptIn(ExperimentalResourceApi::class)

package data.models

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

data class GameEvent(
    var eventId: Int,
    var eventName: String,

    var eventLocation: String,
    var gameStatus: String,

    var eventMessage: String,
    var eventImage: DrawableResource,

    var eventDecision1: EventDecision,
    var eventDecision2: EventDecision,
    var eventDecision3: EventDecision,
    var eventDecision4: EventDecision,
    var eventDecision5: EventDecision,
    var eventDecision6: EventDecision
)
