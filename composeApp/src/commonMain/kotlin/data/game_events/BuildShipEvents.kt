@file:OptIn(ExperimentalResourceApi::class)

package data.game_events

import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.building_rocket1
import cyoaenginekmm.composeapp.generated.resources.considering_rockets
import cyoaenginekmm.composeapp.generated.resources.rocket_built
import data.models.EventDecision
import data.models.GameEvent
import data.models.UserAction
import kotlinx.datetime.Clock
import org.jetbrains.compose.resources.ExperimentalResourceApi

class BuildShipEvents {
    fun startShipBuilder():GameEvent{
        return GameEvent(
            eventId = 50,
            eventMessage = "From the blueprint, there are a few ways to craft the ship with varying costs and benefits. As CEO, choose which you think is best from these options.",
            eventImage = Res.drawable.considering_rockets,
            eventLocation = "earth",
            eventName = "Choose Initial Ship Build",
            eventType = "decision",

            gameStatusChange = "building_ship",
            gameCrewStatusChange = null,
            gameShipHullChange = null,
            gameShipSensorsChange = null,
            gameShipEnginesChange = null,
            gameShipDestinationChange = null,
            gameTimeChange = null,
            gameCompanyFinancesChange = null,

            eventDecision1 = EventDecision(
                decisionName = "Exceptional Ship Build",
                decisionButtonId = 1,
                buttonText = "Exceptional Quality\n" +
                        " Team and Materials\n" +
                        "(Cost: $7 Billion)",
                nextEventId = 53,
                enabled = true,
            ),
            eventDecision2 = EventDecision(
                decisionName = "Satisfactory Ship Build",
                decisionButtonId = 2,
                buttonText = "Satisfactory Build Quality\n$5 Billion",
                nextEventId = 55,
                enabled = true,
            ),
            eventDecision3 = EventDecision(
                decisionName = "Inexpensive Ship Build",
                decisionButtonId = 3,
                buttonText = "Inexpensive, Not Quality\n$3 Billion",
                nextEventId = 53,
                enabled = true,
            ),
            eventDecision4 = EventDecision(
                decisionName = "Inactive",
                decisionButtonId = 4,
                buttonText = "",
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision5 = EventDecision(
                decisionName = "Inactive",
                decisionButtonId = 5,
                buttonText = "",
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision6 = EventDecision(
                decisionName = "Inactive",
                decisionButtonId = 6,
                buttonText = "",
                nextEventId = -1,
                enabled = false,
            ),
            gameStoryText = "From the blueprint, there are a few ways to craft the ship with varying costs and benefits. As CEO, choose which you think is best from these options.",
            gameUserAction = UserAction(
                gameUUID = "",
                currentEventId = 50,
                notes = "ship build decision, user presented with multiple decisions",
                timestamp = Clock.System.now().toEpochMilliseconds(),
            )
        )
    }

    fun getExceptionShipChosen1():GameEvent{
        return GameEvent(
            eventId = 53,
            eventMessage = "You have logically chosen that even though there is a high cost, there is also a high benefit along with it.\n" +
                    "You want a sturdy vessel to travel the stars with.",
            eventImage = Res.drawable.building_rocket1,
            eventLocation = "earth",
            eventName = "Choose Initial Ship Build",
            eventType = "story",

            gameStatusChange = null,
            gameCrewStatusChange = null,
            gameShipHullChange = null,
            gameShipSensorsChange = null,
            gameShipEnginesChange = null,
            gameShipDestinationChange = null,
            gameTimeChange = null,
            gameCompanyFinancesChange = null,

            eventDecision1 = EventDecision(
                decisionName = "",
                decisionButtonId = 1,
                buttonText = "",
                nextEventId = 53,
                enabled = false,
            ),
            eventDecision2 = EventDecision(
                decisionName = "",
                decisionButtonId = 2,
                buttonText = "",
                nextEventId = 55,
                enabled = false,
            ),
            eventDecision3 = EventDecision(
                decisionName = "",
                decisionButtonId = 3,
                buttonText = "",
                nextEventId = 58,
                enabled = false,
            ),
            eventDecision4 = EventDecision(
                decisionName = "Inactive",
                decisionButtonId = 4,
                buttonText = "",
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision5 = EventDecision(
                decisionName = "Inactive",
                decisionButtonId = 5,
                buttonText = "",
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision6 = EventDecision(
                decisionName = "Next",
                decisionButtonId = 6,
                buttonText = "Next",
                nextEventId = 54,
                enabled = true,
            ),
            gameStoryText = "You have logically chosen that even though there is a high cost, there is also a high benefit along with it.",
            gameUserAction = UserAction(
                gameUUID = "",
                currentEventId = 53,
                notes = "exceptional ship chosen, user pressed next",
                timestamp = Clock.System.now().toEpochMilliseconds()
            )
        )
    }

    fun getExceptionShipChosen2():GameEvent{
        return GameEvent(
            eventId = 54,
            eventMessage = "Your ship is built with the best Hull, Sensors, and Engines earth currently has to offer.\n" +
                    "You shouldn't need to invest any more into it for awhile.",
            eventImage = Res.drawable.rocket_built,
            eventLocation = "earth",
            eventName = "Choose Initial Ship Build",
            eventType = "change_stats",

            gameStatusChange = "ship_built",
            gameCrewStatusChange = null,
            gameShipHullChange = 4,
            gameShipSensorsChange = 4,
            gameShipEnginesChange = 4,
            gameShipDestinationChange = null,
            gameTimeChange = null,
            gameCompanyFinancesChange = -7000000000,

            eventDecision1 = EventDecision(
                decisionName = "Exceptional Ship Build",
                decisionButtonId = 1,
                buttonText = "Exceptional Quality\n" +
                        " Team and Materials\n" +
                        "(Cost: $7 Billion)",
                nextEventId = 53,
                enabled = false,
            ),
            eventDecision2 = EventDecision(
                decisionName = "Satisfactory Ship Build",
                decisionButtonId = 2,
                buttonText = "Satisfactory Build Quality\n$5 Billion",
                nextEventId = 53,
                enabled = false,
            ),
            eventDecision3 = EventDecision(
                decisionName = "Inexpensive Ship Build",
                decisionButtonId = 3,
                buttonText = "Inexpensive, Not Quality\n$3 Billion",
                nextEventId = 53,
                enabled = false,
            ),
            eventDecision4 = EventDecision(
                decisionName = "Inactive",
                decisionButtonId = 4,
                buttonText = "",
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision5 = EventDecision(
                decisionName = "Inactive",
                decisionButtonId = 5,
                buttonText = "",
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision6 = EventDecision(
                decisionName = "Continue",
                decisionButtonId = 6,
                buttonText = "Find Crews",
                nextEventId = -1,
                enabled = true,
            ),
            gameStoryText = "Your ship is built with the best Hull, Sensors, and Engines earth currently has to offer.",
            gameUserAction = UserAction(
                gameUUID = "",
                currentEventId = 54,
                notes = "exceptional ship constructed, user pressed next",
                timestamp = Clock.System.now().toEpochMilliseconds()
            )
        )
    }

    fun getSatisfactorynShipChosen1():GameEvent{
        return GameEvent(
            eventId = 55,
            eventMessage = "You have decided that it's best to get a lot of value out of your ship and went with a Satisfactory option. The engineering team begins work right away.",
            eventImage = Res.drawable.building_rocket1,
            eventLocation = "earth",
            eventName = "Choose Initial Ship Build",
            eventType = "story",

            gameStatusChange = null,
            gameCrewStatusChange = null,
            gameShipHullChange = null,
            gameShipSensorsChange = null,
            gameShipEnginesChange = null,
            gameShipDestinationChange = null,
            gameTimeChange = null,
            gameCompanyFinancesChange = null,

            eventDecision1 = EventDecision(
                decisionName = "",
                decisionButtonId = 1,
                buttonText = "",
                nextEventId = 53,
                enabled = false,
            ),
            eventDecision2 = EventDecision(
                decisionName = "",
                decisionButtonId = 2,
                buttonText = "",
                nextEventId = 55,
                enabled = false,
            ),
            eventDecision3 = EventDecision(
                decisionName = "",
                decisionButtonId = 3,
                buttonText = "",
                nextEventId = 58,
                enabled = false,
            ),
            eventDecision4 = EventDecision(
                decisionName = "Inactive",
                decisionButtonId = 4,
                buttonText = "",
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision5 = EventDecision(
                decisionName = "Inactive",
                decisionButtonId = 5,
                buttonText = "",
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision6 = EventDecision(
                decisionName = "Next",
                decisionButtonId = 6,
                buttonText = "Next",
                nextEventId = 56,
                enabled = true,
            ),
            gameStoryText = "You have decided that it's best to get a lot of value out of your ship and went with a Satisfactory option. The engineering team begins work right away.",
            gameUserAction = UserAction(
                gameUUID = "",
                currentEventId = 55,
                notes = "Satisfactory ship chosen, user pressed next",
                timestamp = Clock.System.now().toEpochMilliseconds()
            )
        )
    }

    fun getSatisfactorynShipChosen2():GameEvent{
        return GameEvent(
            eventId = 56,
            eventMessage = "Your ship is built with a decent Hull, Sensors, and Engines earth.\n" +
                    "You shouldn't need to invest any more into it unless something happens.",
            eventImage = Res.drawable.rocket_built,
            eventLocation = "earth",
            eventName = "Choose Initial Ship Build",
            eventType = "change_stats",

            gameStatusChange = "ship_built",
            gameCrewStatusChange = null,
            gameShipHullChange = 3,
            gameShipSensorsChange = 3,
            gameShipEnginesChange = 3,
            gameShipDestinationChange = null,
            gameTimeChange = null,
            gameCompanyFinancesChange = -5000000000,

            eventDecision1 = EventDecision(
                decisionName = "",
                decisionButtonId = 1,
                buttonText = "",
                nextEventId = 53,
                enabled = false,
            ),
            eventDecision2 = EventDecision(
                decisionName = "",
                decisionButtonId = 2,
                buttonText = "",
                nextEventId = 55,
                enabled = false,
            ),
            eventDecision3 = EventDecision(
                decisionName = "",
                decisionButtonId = 3,
                buttonText = "",
                nextEventId = 58,
                enabled = false,
            ),
            eventDecision4 = EventDecision(
                decisionName = "Inactive",
                decisionButtonId = 4,
                buttonText = "",
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision5 = EventDecision(
                decisionName = "Inactive",
                decisionButtonId = 5,
                buttonText = "",
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision6 = EventDecision(
                decisionName = "Next",
                decisionButtonId = 6,
                buttonText = "Next",
                nextEventId = -1,
                enabled = true,
            ),
            gameStoryText = "Your ship is built with a decent Hull, Sensors, and Engines earth.",
            gameUserAction = UserAction(
                gameUUID = "",
                currentEventId = 56,
                notes = "you build a decent ship, user pressed next",
                timestamp = Clock.System.now().toEpochMilliseconds()
            )
        )
    }
}