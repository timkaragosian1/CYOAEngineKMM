@file:OptIn(ExperimentalResourceApi::class)

package data.game_events

import com.arkivanov.decompose.value.MutableValue
import data.models.GameEvent
import org.jetbrains.compose.resources.ExperimentalResourceApi
import ui.components.GameScreen.GameScreenComponent

class SpaceEvents {
    fun getEventFromId(nextEventId: MutableValue<Int>, component: GameScreenComponent): GameEvent {
        val startingStoryGameEvents = StartingStoryGameEvents()
        val buildShipEvents = BuildShipEvents()

        when (nextEventId.value) {
            -1 -> return startingStoryGameEvents.getStartingGameEvent(component)//component.handleGameOver()
            0 -> return startingStoryGameEvents.getStartingGameEvent(component)
            1 -> return startingStoryGameEvents.getStartingSpaceEvent2()
            2 -> return startingStoryGameEvents.getStartingSpaceEvent3()
            3 -> return startingStoryGameEvents.getStartingSpaceEvent4()
            4 -> return startingStoryGameEvents.getStartingSpaceEvent5()
            5 -> return buildShipEvents.startShipBuilder()
            53 -> return buildShipEvents.getExceptionShipChosen1()
            54 -> return buildShipEvents.getExceptionShipChosen2()
            55 -> return buildShipEvents.getSatisfactorynShipChosen1()
            56 -> return buildShipEvents.getSatisfactorynShipChosen2()
        }
        return startingStoryGameEvents.getStartingGameEvent(component)
    }
}