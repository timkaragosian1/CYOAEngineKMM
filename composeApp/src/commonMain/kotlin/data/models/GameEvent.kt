@file:OptIn(ExperimentalResourceApi::class)

package data.models

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

data class GameEvent(
    var eventId: Int,
    var eventName: String,
    var eventLocation: String,
    var eventType: String,
    var eventMessage: String,
    var eventImage: DrawableResource,

    var gameStatusChange: String?,
    var gameCrewStatusChange: Int?,
    var gameShipHullChange: Int?,
    var gameShipEnginesChange: Int?,
    var gameShipSensorsChange:Int?,
    var gameShipDestinationChange:String?,
    var gameTimeChange:Double?,
    var gameCompanyFinancesChange: Long?,

    var eventDecision1: EventDecision,
    var eventDecision2: EventDecision,
    var eventDecision3: EventDecision,
    var eventDecision4: EventDecision,
    var eventDecision5: EventDecision,
    var eventDecision6: EventDecision,

    var gameHistory: String?
)
