@file:OptIn(ExperimentalResourceApi::class)

package data.game_events

import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.rocket_built
import data.models.EventDecision
import data.models.GameEvent
import data.models.UserAction
import kotlinx.datetime.Clock
import org.jetbrains.compose.resources.ExperimentalResourceApi

class EventUtils {
    fun getBlankGameEvent(): GameEvent {
        return GameEvent(
            eventId = -1,
            eventMessage = "" + //text story line 1
                    "" + //text story line 3
                    "", //text story line 3
            eventImage = Res.drawable.rocket_built, //image drawable resource
            eventLocation = "", //string of earth/space/mars/moon/etc
            eventName = "", //simple string of event name
            eventType = "", //event type name string for check: change_stats/gamestart/etc

            gameStatusChange = null, //string status of what is occuring, can be different every time
            gameCrewStatusChange = null, //indicates an amount that will change positive or negative
            gameShipHullChange = null, //indicates an amount that will change
            gameShipSensorsChange = null, //indicates an amount that will change
            gameShipEnginesChange = null, //indicates an amount that will change
            gameShipDestinationChange = null, //indicates a string location if anything should change
            gameTimeChange = null, //indicates if there should be a time change different than the standard .5 per event
            gameCompanyFinancesChange = null, //money amount change either positive or negative

            eventDecision1 = EventDecision(
                decisionButtonId = 1,
                decisionName = "",
                buttonText = "" + //button text line 1
                        "" + //button text line 3
                        "", //button text line 3
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision2 = EventDecision(
                decisionButtonId = 2,
                decisionName = "",
                buttonText = "" + //button text line 1
                        "" + //button text line 3
                        "", //button text line 3
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision3 = EventDecision(
                decisionButtonId = 3,
                decisionName = "",
                buttonText = "" + //button text line 1
                        "" + //button text line 3
                        "", //button text line 3
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision4 = EventDecision(
                decisionButtonId = 4,
                decisionName = "",
                buttonText = "" + //button text line 1
                        "" + //button text line 3
                        "", //button text line 3
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision5 = EventDecision(
                decisionButtonId = 5,
                decisionName = "",
                buttonText = "" + //button text line 1
                        "" + //button text line 3
                        "", //button text line 3
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision6 = EventDecision(
                decisionButtonId = 6,
                decisionName = "",
                buttonText = "" + //button text line 1
                        "" + //button text line 3
                        "", //button text line 3
                nextEventId = -1,
                enabled = false,
            ),
            gameStoryText = null,
            gameUserAction = UserAction(
                currentEventId = 0,
                notes = "",
                timestamp = Clock.System.now().toEpochMilliseconds()
            )
        )
    }
}