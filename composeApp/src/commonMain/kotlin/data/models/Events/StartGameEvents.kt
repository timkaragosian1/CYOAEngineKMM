@file:OptIn(ExperimentalResourceApi::class)

package data.models.Events

import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.red_rocket_art1
import cyoaenginekmm.composeapp.generated.resources.red_rocket_hole_repair
import cyoaenginekmm.composeapp.generated.resources.spr_stars01
import data.models.EventDecision
import data.models.GameEvent
import org.jetbrains.compose.resources.ExperimentalResourceApi

class StartGameEvents {
    /**
     * 1. Asks about what company makes and asks about company's rise to power through CEO
     * 2. Facial Scan complete
     * 3. This is a PENIC (Personal Efforless Network Instant Communication) device to give you company and Ship status.
     * 4. Device is for quick decisions and communications. You are the CEO and must remain at the company HQ in America.
     * 5. With you at the helm, your first order of business is leading the company to space to save the planet
     * 6. Earth is almost exhausted of natural resources and must take to the stars to continue to thrive, survive, and profit!
     * 6. Your company has been offered a government contract to gather resources from the local celestial planets over the next 20 years!
     * 7. You are provided a flexible blueprint made from the best minds globally. You immediately begin contracting engineers to build it.
     * 8.
     *
     * Stats to track:
     *      - Company Finances: Int
     *
     *      - Ship hull: 1/2/3/4/5
     *      - Ship engines: 1/2/3/4/5
     *      - Ship sensors: 1/2/3/4/5
     *
     *      - Crew condition: 1/2/3/4/5
     *      - Time Left: Double (years)
     *      -
     * Types of Conditions:
     *      1 = Critical
     *      2 = Poor
     *      3 = Normal
     *      4 = Good
     *      5 = Optimal
     *
     * Each event series should:
     *      - Tell Story
     *      - Allow decisions
     *      - Calculate result based on stats
     *      - Handle Stat Changes
     *      - Check for end game conditions
     *      - Navigate to next event path properly
     */

    fun startShipBuilder():GameEvent{
        return GameEvent(
            eventId = 50,
            eventMessage = "From the blueprint, there are a few ways to craft the ship with varying costs and benefits. As CEO, choose which you think is best from these options.",
            eventImage = Res.drawable.red_rocket_hole_repair,
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
                nextEventId = 53,
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
        )
    }

    fun getExceptionShipChosen1():GameEvent{
        return GameEvent(
            eventId = 50,
            eventMessage = "You have logically chosen that even though there is a high cost, there is also a high benefit along with it.\n" +
                    "You want a sturdy vessel to travel the stars with.",
            eventImage = Res.drawable.red_rocket_hole_repair,
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
                decisionName = "Next",
                decisionButtonId = 6,
                buttonText = "Next",
                nextEventId = 54,
                enabled = true,
            ),
        )
    }

    fun getExceptionShipChosen2():GameEvent{
        return GameEvent(
            eventId = 54,
            eventMessage = "Your ship is built with the best Hull, Sensors, and Engines earth currently has to offer.\n" +
                    "You shouldn't need to invest any more into it for awhile.",
            eventImage = Res.drawable.red_rocket_hole_repair,
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
        )
    }
}