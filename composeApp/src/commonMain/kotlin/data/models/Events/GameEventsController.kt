@file:OptIn(ExperimentalResourceApi::class, ExperimentalResourceApi::class)

package data.models.Events

import com.arkivanov.decompose.value.MutableValue
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.earth_resources_limited
import cyoaenginekmm.composeapp.generated.resources.new_celestial_market
import cyoaenginekmm.composeapp.generated.resources.penic_device
import cyoaenginekmm.composeapp.generated.resources.rocket_blueprint
import cyoaenginekmm.composeapp.generated.resources.usa_resource_company
import data.models.EventDecision
import data.models.GameEvent
import org.jetbrains.compose.resources.ExperimentalResourceApi
import ui.components.ViewModels.GameScreenComponent

class SpaceEvents {
    fun getEventFromId(nextEventId: MutableValue<Int>, component: GameScreenComponent): GameEvent {
        when (nextEventId.value) {
            -1 -> return getStartingGameEvent(component)
            0 -> return getStartingGameEvent(component)
            1 -> return getStartingSpaceEvent2()
            2 -> return getStartingSpaceEvent3()
            3 -> return getStartingSpaceEvent4()
            4 -> return getStartingSpaceEvent5()
            5 -> return BuildShipEvents().startShipBuilder()
            53 -> return BuildShipEvents().getExceptionShipChosen1()
            54 -> return BuildShipEvents().getExceptionShipChosen2()
        }
        return getStartingGameEvent(component)
    }

    fun getStartingGameEvent(component: GameScreenComponent): GameEvent {
        return GameEvent(
            eventName = "Start of Game",
            eventId = 0,
            eventLocation = "earth",
            eventImage = Res.drawable.usa_resource_company,
            eventMessage = "Welcome CEO of General Resources! One of the finest resource gathering companies in the world and the finest in the USA.",
            eventDecision1 = EventDecision(
                decisionButtonId = 1,
                decisionName = "Button 1",
                nextEventId = -1,
                enabled = false,
                buttonText = "Button 1"
            ),
            eventDecision2 = EventDecision(
                decisionButtonId = 2,
                decisionName = "Button 2",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision3 = EventDecision(
                decisionButtonId = 3,
                decisionName = "Button 3",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision4 = EventDecision(
                decisionButtonId = 4,
                decisionName = "Button 4",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision5 = EventDecision(
                decisionButtonId = 5,
                decisionName = "Button 5",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision6 = EventDecision(
                decisionButtonId = 6,
                decisionName = "Button 6",
                nextEventId = 1,
                enabled = true,
                buttonText = "NEXT"
            ),
            eventType = "gamestatuschange",
            gameCompanyFinancesChange = null,
            gameTimeChange = null,
            gameShipDestinationChange = null,
            gameShipEnginesChange = null,
            gameShipSensorsChange = null,
            gameShipHullChange = null,
            gameCrewStatusChange = null,
            gameStatusChange = "gamestart",
        )
    }

    fun getStartingSpaceEvent2(): GameEvent {
        return GameEvent(
            eventName = "Start of Game",
            eventId = 0,
            eventLocation = "earth",
            eventImage = Res.drawable.penic_device,
            eventMessage = "You are using the P.E.N.I.C. or Personal Effortless Network Interface Communicator device. You will be able to get quick, fast visualization and information to make decisions.",
            eventDecision1 = EventDecision(
                decisionButtonId = 1,
                decisionName = "Button 1",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision2 = EventDecision(
                decisionButtonId = 2,
                decisionName = "Button 2",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision3 = EventDecision(
                decisionButtonId = 3,
                decisionName = "Button 3",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision4 = EventDecision(
                decisionButtonId = 4,
                decisionName = "Button 4",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision5 = EventDecision(
                decisionButtonId = 5,
                decisionName = "Button 5",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision6 = EventDecision(
                decisionButtonId = 6,
                decisionName = "Button 6",
                nextEventId = 2,
                enabled = true,
                buttonText = "NEXT"
            ),
            eventType = "",
            gameCompanyFinancesChange = null,
            gameTimeChange = null,
            gameShipDestinationChange = null,
            gameShipEnginesChange = null,
            gameShipSensorsChange = null,
            gameShipHullChange = null,
            gameCrewStatusChange = null,
            gameStatusChange = null,
        )
    }

    fun getStartingSpaceEvent3(): GameEvent {
        return GameEvent(
            eventName = "Start of Game",
            eventId = 0,
            eventLocation = "earth",
            eventImage = Res.drawable.earth_resources_limited,
            eventMessage = "The Earth had 20 years left of useable resources and mankind must take to the stars to continue thriving, surviving, and most importantly, profiting!",
            eventDecision1 = EventDecision(
                decisionButtonId = 1,
                decisionName = "Button 1",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision2 = EventDecision(
                decisionButtonId = 2,
                decisionName = "Button 2",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision3 = EventDecision(
                decisionButtonId = 3,
                decisionName = "Button 3",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision4 = EventDecision(
                decisionButtonId = 4,
                decisionName = "Button 4",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision5 = EventDecision(
                decisionButtonId = 5,
                decisionName = "Button 5",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision6 = EventDecision(
                decisionButtonId = 6,
                decisionName = "Button 6",
                nextEventId = 3,
                enabled = true,
                buttonText = "NEXT"
            ),
            eventType = "",
            gameCompanyFinancesChange = null,
            gameTimeChange = null,
            gameShipDestinationChange = null,
            gameShipEnginesChange = null,
            gameShipSensorsChange = null,
            gameShipHullChange = null,
            gameCrewStatusChange = null,
            gameStatusChange = null,
        )
    }

    fun getStartingSpaceEvent4(): GameEvent {
        return GameEvent(
            eventName = "Start of Game",
            eventId = 0,
            eventLocation = "earth",
            eventImage = Res.drawable.new_celestial_market,
            eventMessage = "Your company has been one of many chosen to capitalize on the new celestial market. Where will you go? How much money will you make?",
            eventDecision1 = EventDecision(
                decisionButtonId = 1,
                decisionName = "Button 1",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision2 = EventDecision(
                decisionButtonId = 2,
                decisionName = "Button 2",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision3 = EventDecision(
                decisionButtonId = 3,
                decisionName = "Button 3",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision4 = EventDecision(
                decisionButtonId = 4,
                decisionName = "Button 4",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision5 = EventDecision(
                decisionButtonId = 5,
                decisionName = "Button 5",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision6 = EventDecision(
                decisionButtonId = 6,
                decisionName = "Button 6",
                nextEventId = 4,
                enabled = true,
                buttonText = "NEXT"
            ),
            eventType = "",
            gameCompanyFinancesChange = null,
            gameTimeChange = null,
            gameShipDestinationChange = null,
            gameShipEnginesChange = null,
            gameShipSensorsChange = null,
            gameShipHullChange = null,
            gameCrewStatusChange = null,
            gameStatusChange = null,
        )
    }

    fun getStartingSpaceEvent5(): GameEvent {
        return GameEvent(
            eventName = "Start of Game",
            eventId = 0,
            eventLocation = "earth",
            eventImage = Res.drawable.rocket_blueprint,
            eventMessage = "The world's finest minds have agreed upon the most effective means of space travel and have shared the design with all the possible companies who could use it.",
            eventDecision1 = EventDecision(
                decisionButtonId = 1,
                decisionName = "Button 1",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision2 = EventDecision(
                decisionButtonId = 2,
                decisionName = "Button 2",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision3 = EventDecision(
                decisionButtonId = 3,
                decisionName = "Button 3",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision4 = EventDecision(
                decisionButtonId = 4,
                decisionName = "Button 4",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision5 = EventDecision(
                decisionButtonId = 5,
                decisionName = "Button 5",
                nextEventId = -1,
                enabled = false,
                buttonText = ""
            ),
            eventDecision6 = EventDecision(
                decisionButtonId = 6,
                decisionName = "Button 6",
                nextEventId = 5,
                enabled = true,
                buttonText = "NEXT"
            ),
            eventType = "",
            gameCompanyFinancesChange = null,
            gameTimeChange = null,
            gameShipDestinationChange = null,
            gameShipEnginesChange = null,
            gameShipSensorsChange = null,
            gameShipHullChange = null,
            gameCrewStatusChange = null,
            gameStatusChange = null,
        )
    }
}