@file:OptIn(ExperimentalResourceApi::class)

package ui.components.GameScreen

import com.arkivanov.decompose.value.MutableValue
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.red_rocket_art1
import data.models.Events.SpaceEvents
import data.models.GameEvent
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import ui.components.ViewModels.GameScreenComponent

class GameScreenComponentEventController {
    fun setupSpaceEventUI(
        spaceEvent: GameEvent,
        eventMessage: MutableValue<String>,
        eventImage: MutableValue<DrawableResource>,
        eventType: MutableValue<String>,
        eventLocation: MutableValue<String>,
        button1Text: MutableValue<String>,
        button2Text: MutableValue<String>,
        button3Text: MutableValue<String>,
        button4Text: MutableValue<String>,
        button5Text: MutableValue<String>,
        button6Text: MutableValue<String>,
        button1Enabled: MutableValue<Boolean>,
        button2Enabled: MutableValue<Boolean>,
        button3Enabled: MutableValue<Boolean>,
        button4Enabled: MutableValue<Boolean>,
        button5Enabled: MutableValue<Boolean>,
        button6Enabled: MutableValue<Boolean>,
        button1NextEvent: MutableValue<Int>,
        button2NextEvent: MutableValue<Int>,
        button3NextEvent: MutableValue<Int>,
        button4NextEvent: MutableValue<Int>,
        button5NextEvent: MutableValue<Int>,
        button6NextEvent: MutableValue<Int>,
        companyFinances: MutableValue<Long>,
        gameStatus: MutableValue<String>,
        gameCrewStatus: MutableValue<Int>,
        gameTime: MutableValue<Double>,
        gameShipHull: MutableValue<Int>,
        gameShipEngines: MutableValue<Int>,
        gameShipSensors: MutableValue<Int>,
    ) {
        eventMessage.value = spaceEvent.eventMessage
        eventImage.value = spaceEvent.eventImage
        eventType.value = spaceEvent.eventType
        eventLocation.value = spaceEvent.eventLocation
        button1Text.value = spaceEvent.eventDecision1.buttonText
        button2Text.value = spaceEvent.eventDecision2.buttonText
        button3Text.value = spaceEvent.eventDecision3.buttonText
        button4Text.value = spaceEvent.eventDecision4.buttonText
        button5Text.value = spaceEvent.eventDecision5.buttonText
        button6Text.value = spaceEvent.eventDecision6.buttonText
        button1Enabled.value = spaceEvent.eventDecision1.enabled
        button2Enabled.value = spaceEvent.eventDecision2.enabled
        button3Enabled.value = spaceEvent.eventDecision3.enabled
        button4Enabled.value = spaceEvent.eventDecision4.enabled
        button5Enabled.value = spaceEvent.eventDecision5.enabled
        button6Enabled.value = spaceEvent.eventDecision6.enabled
        button1NextEvent.value = spaceEvent.eventDecision1.nextEventId
        button2NextEvent.value = spaceEvent.eventDecision2.nextEventId
        button3NextEvent.value = spaceEvent.eventDecision3.nextEventId
        button4NextEvent.value = spaceEvent.eventDecision4.nextEventId
        button5NextEvent.value = spaceEvent.eventDecision5.nextEventId
        button6NextEvent.value = spaceEvent.eventDecision6.nextEventId

        if (spaceEvent.eventType.equals("change_stats")) {
            if (!spaceEvent.gameStatusChange.isNullOrEmpty()) {
                gameStatus.value = spaceEvent.gameStatusChange.orEmpty()
            }

            if (spaceEvent.gameCompanyFinancesChange != null) {
                companyFinances.value = spaceEvent.gameCompanyFinancesChange!! + companyFinances.value
            }

            if (spaceEvent.gameCrewStatusChange != null) {
                gameCrewStatus.value = spaceEvent.gameCrewStatusChange!! + gameCrewStatus.value
            }

            if (spaceEvent.gameShipHullChange != null) {
                gameShipHull.value = spaceEvent.gameShipHullChange!! + gameShipHull.value
            }

            if (spaceEvent.gameShipEnginesChange != null) {
                gameShipEngines.value = spaceEvent.gameShipEnginesChange!! + gameShipEngines.value
            }

            if (spaceEvent.gameShipSensorsChange != null) {
                gameShipSensors.value = spaceEvent.gameShipSensorsChange!! + gameShipSensors.value
            }

            if (spaceEvent.gameTimeChange != null) {
                gameTime.value = gameTime.value - spaceEvent.gameTimeChange!!
            } else {
                gameTime.value = gameTime.value - 0.5
            }
        }

        if (spaceEvent.eventType.equals("gamestatuschange_ThisWillNeverHappenNow")) {
            if (!spaceEvent.gameStatusChange.isNullOrEmpty()) {
                gameStatus.value = spaceEvent.gameStatusChange.orEmpty()
                if (spaceEvent.gameStatusChange.equals("gamerestart")) {
                    eventMessage.value = "Welcome to cCommerce!"
                    eventImage.value = Res.drawable.red_rocket_art1
                    eventType.value = "gamestart"
                    eventLocation.value = "earth"
                    button1Text.value = ""
                    button2Text.value = ""
                    button3Text.value = ""
                    button4Text.value = ""
                    button5Text.value = ""
                    button6Text.value = "Next"
                    button1Enabled.value = false
                    button2Enabled.value = false
                    button3Enabled.value = false
                    button4Enabled.value = false
                    button5Enabled.value = false
                    button6Enabled.value = false
                    button1NextEvent.value = 0
                    button2NextEvent.value = 0
                    button3NextEvent.value = 0
                    button4NextEvent.value = 0
                    button5NextEvent.value = 0
                    button6NextEvent.value = 0
                    gameTime.value = 20.0
                    companyFinances.value = 10000000000
                    gameShipHull.value = 0
                    gameShipEngines.value = 0
                    gameShipSensors.value = 0
                }
            }
        }
    }

    fun handleNextEvent(
        eventMessage: MutableValue<String>,
        eventImage: MutableValue<DrawableResource>,
        eventType: MutableValue<String>,
        eventLocation: MutableValue<String>,
        button1Text: MutableValue<String>,
        button2Text: MutableValue<String>,
        button3Text: MutableValue<String>,
        button4Text: MutableValue<String>,
        button5Text: MutableValue<String>,
        button6Text: MutableValue<String>,
        button1Enabled: MutableValue<Boolean>,
        button2Enabled: MutableValue<Boolean>,
        button3Enabled: MutableValue<Boolean>,
        button4Enabled: MutableValue<Boolean>,
        button5Enabled: MutableValue<Boolean>,
        button6Enabled: MutableValue<Boolean>,
        button1NextEvent: MutableValue<Int>,
        button2NextEvent: MutableValue<Int>,
        button3NextEvent: MutableValue<Int>,
        button4NextEvent: MutableValue<Int>,
        button5NextEvent: MutableValue<Int>,
        button6NextEvent: MutableValue<Int>,
        nextEvent: MutableValue<Int>,
        companyFinances: MutableValue<Long>,
        gameStatus: MutableValue<String>,
        gameCrewStatus: MutableValue<Int>,
        gameTime: MutableValue<Double>,
        gameShipHull: MutableValue<Int>,
        gameShipEngines: MutableValue<Int>,
        gameShipSensors: MutableValue<Int>,
        component: GameScreenComponent
    ) {
        setupSpaceEventUI(
            SpaceEvents().getEventFromId(nextEvent, component),
            eventMessage,
            eventImage,
            eventType,
            eventLocation,
            button1Text,
            button2Text,
            button3Text,
            button4Text,
            button5Text,
            button6Text,
            button1Enabled,
            button2Enabled,
            button3Enabled,
            button4Enabled,
            button5Enabled,
            button6Enabled,
            button1NextEvent,
            button2NextEvent,
            button3NextEvent,
            button4NextEvent,
            button5NextEvent,
            button6NextEvent,
            companyFinances,
            gameStatus,
            gameCrewStatus,
            gameTime,
            gameShipHull,
            gameShipEngines,
            gameShipSensors,
        )
    }
}