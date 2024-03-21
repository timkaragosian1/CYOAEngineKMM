@file:OptIn(ExperimentalResourceApi::class)

package data.models.Events

import com.arkivanov.decompose.value.MutableValue
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.red_rocket_art1
import cyoaenginekmm.composeapp.generated.resources.red_rocket_art2
import cyoaenginekmm.composeapp.generated.resources.red_rocket_impact
import data.models.EventDecision
import data.models.GameEvent
import org.jetbrains.compose.resources.ExperimentalResourceApi

class SpaceEvents {
    fun getEventFromId(nextEventId: MutableValue<Int>): GameEvent {
        when (nextEventId.value) {
            -1 -> return getRandomSpaceEvent()
            0 -> return getStartingSpaceEvent1()
            1 -> return getStartingSpaceEvent2()
            2 -> return getStartingSpaceEvent3()
            3 -> return getStartingSpaceEvent4()
        }
        return getStartingSpaceEvent1()
    }

    fun getStartingSpaceEvent1(): GameEvent {
        return GameEvent(
            eventName = "Start of Game",
            eventId = 0,
            eventLocation = "earth",
            gameStatus = "gamestart",
            eventImage = Res.drawable.red_rocket_art1,
            eventMessage = "This is the first screen to start with",
            eventDecision1 = EventDecision(
                decisionButtonId = 1,
                decisionName = "Button 1",
                nextEventId = -1,
                enabled = true,
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
            )
        )
    }

    fun getStartingSpaceEvent2(): GameEvent {
        return GameEvent(
            eventName = "Start of Game",
            eventId = 0,
            eventLocation = "earth",
            gameStatus = "gamestart",
            eventImage = Res.drawable.red_rocket_art2,
            eventMessage = "This is the second screen to start with",
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
            )
        )
    }

    fun getStartingSpaceEvent3(): GameEvent {
        return GameEvent(
            eventName = "Start of Game",
            eventId = 0,
            eventLocation = "earth",
            gameStatus = "gamestart",
            eventImage = Res.drawable.red_rocket_art2,
            eventMessage = "This is the third screen to start with",
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
            )
        )
    }

    fun getStartingSpaceEvent4(): GameEvent {
        return GameEvent(
            eventName = "Start of Game",
            eventId = 0,
            eventLocation = "earth",
            gameStatus = "gamestart",
            eventImage = Res.drawable.red_rocket_art1,
            eventMessage = "This is the fourth screen to start with",
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
            )
        )
    }

    fun getRandomSpaceEvent(): GameEvent {
        return GameEvent(
            eventName = "Start of Game",
            eventId = 0,
            eventLocation = "earth",
            gameStatus = "gamestart",
            eventImage = Res.drawable.red_rocket_impact,
            eventMessage = "This is the first screen to start with",
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
                nextEventId = 1,
                enabled = true,
                buttonText = "NEXT"
            )
        )
    }
}