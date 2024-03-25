@file:OptIn(ExperimentalResourceApi::class)

package data.models.Events

import androidx.compose.runtime.Composable
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.blank
import cyoaenginekmm.composeapp.generated.resources.rocket_built
import data.models.EventDecision
import data.models.GameEvent
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource

class EventUtils {
    /**
    * Types of Conditions:
    *      1 = Critical -> Red
    *      2 = Poor -> Orange
    *      3 = Normal - > Yellow
    *      4 = Good -> Green
    *      5 = Optimal -> Blue
    *      6 = Super -> Multicolored Gradient
    *
    * Each event series should:
    *      - Tell Story
    *      - Allow decisions
    *      - Calculate result based on stats
    *      - Handle Stat Changes
    *      - Check for end game conditions
    *      - Navigate to next event path properly
    */

    @Composable
    fun getBlankGameEvent(): GameEvent {
        return GameEvent(
            eventId = -1,
            eventMessage = "${stringResource(Res.string.blank)}\n" + //text story line 1
                    "${stringResource(Res.string.blank)}\n" + //text story line 3
                    "${stringResource(Res.string.blank)}", //text story line 3
            eventImage = Res.drawable.rocket_built, //image drawable resource
            eventLocation = stringResource(Res.string.blank), //string of earth/space/mars/moon/etc
            eventName = stringResource(Res.string.blank), //simple string of event name
            eventType = stringResource(Res.string.blank), //event type name string for check: change_stats/gamestart/etc

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
                decisionName = stringResource(Res.string.blank),
                buttonText = "${stringResource(Res.string.blank)}\n" + //button text line 1
                        "${stringResource(Res.string.blank)}\n" + //button text line 3
                        "${stringResource(Res.string.blank)}", //button text line 3
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision2 = EventDecision(
                decisionButtonId = 2,
                decisionName = stringResource(Res.string.blank),
                buttonText = "${stringResource(Res.string.blank)}\n" + //button text line 1
                        "${stringResource(Res.string.blank)}\n" + //button text line 3
                        "${stringResource(Res.string.blank)}", //button text line 3
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision3 = EventDecision(
                decisionButtonId = 3,
                decisionName = stringResource(Res.string.blank),
                buttonText = "${stringResource(Res.string.blank)}\n" + //button text line 1
                        "${stringResource(Res.string.blank)}\n" + //button text line 3
                        "${stringResource(Res.string.blank)}", //button text line 3
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision4 = EventDecision(
                decisionButtonId = 4,
                decisionName = stringResource(Res.string.blank),
                buttonText = "${stringResource(Res.string.blank)}\n" + //button text line 1
                        "${stringResource(Res.string.blank)}\n" + //button text line 3
                        "${stringResource(Res.string.blank)}", //button text line 3
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision5 = EventDecision(
                decisionButtonId = 5,
                decisionName = stringResource(Res.string.blank),
                buttonText = "${stringResource(Res.string.blank)}\n" + //button text line 1
                        "${stringResource(Res.string.blank)}\n" + //button text line 3
                        "${stringResource(Res.string.blank)}", //button text line 3
                nextEventId = -1,
                enabled = false,
            ),
            eventDecision6 = EventDecision(
                decisionButtonId = 6,
                decisionName = stringResource(Res.string.blank),
                buttonText = "${stringResource(Res.string.blank)}\n" + //button text line 1
                        "${stringResource(Res.string.blank)}\n" + //button text line 3
                        "${stringResource(Res.string.blank)}", //button text line 3
                nextEventId = -1,
                enabled = false,
            ),
        )
    }
}