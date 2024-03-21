@file:OptIn(ExperimentalResourceApi::class, ExperimentalResourceApi::class)

package data.models.Events

import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.red_rocket_art1
import cyoaenginekmm.composeapp.generated.resources.red_rocket_art2
import data.models.EventDecision
import data.models.GameEvent
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

class SpaceCollisionEvent {
    /*fun getObjectCollisionSpaceEvent(): GameEvent {
        return GameEvent(
            eventId = 1,
            eventName = "Space Object Collision",
            eventLocation = "space",

            eventMessages = getObjectCollisionEventMessages(),
            eventImages = getObjectCollisionEventImages(),
            eventDecisions = getObjectCollisionEventDecisions()
        )
    }

    fun getObjectCollisionEventMessages(): List<String> {
        return listOf(
            "Something has hit the external hull of your ship!",
            "You take a moment to consider what to do next...")
    }

    fun getObjectCollisionEventImages(): List<DrawableResource> {
        return listOf(
            Res.drawable.red_rocket_art1,
            Res.drawable.red_rocket_art2)
    }

    fun getObjectCollisionEventDecisions(): List<EventDecision>{
        return listOf<EventDecision>(
            EventDecision(
                decisionId = 1,
                decisionName = "Ignore the Damage and Continue",
                buttonText = "Ignore the Damage and Continue",
                decisionMessages = listOf(
                    "You decide to Ignore the Damage and Continue",
                    "This might be a bad idea",
                    "your ship remains damaged"),
                decisionImages = listOf(
                    Res.drawable.red_rocket_art1,
                    Res.drawable.red_rocket_art2)
            ),
            EventDecision(
                decisionId = 2,
                decisionName = "Fix the Ship Properly",
                buttonText = "Fix the Ship Properly",
                decisionMessages = listOf(
                    "You decide to Fix the Ship Properly",
                    "This is a good idea",
                    "you have smooth sailing from here"),
                decisionImages = listOf(
                    Res.drawable.red_rocket_art1,
                    Res.drawable.red_rocket_art2)
            ),
            EventDecision(
                decisionId = 3,
                decisionName = "Fix the Ship Quickly",
                buttonText = "Fix the Ship Quickly",
                decisionMessages = listOf(
                    "You decide to Fix the Ship as Quickly as possible",
                    "This is a a so-so idea",
                    "you have rough travel from here"),
                decisionImages = listOf(
                    Res.drawable.red_rocket_art1,
                    Res.drawable.red_rocket_art2)
            ),
            EventDecision(
                decisionId = 4,
                decisionName = "",
                buttonText = "",
                decisionMessages = listOf(
                    ""),
                decisionImages = listOf(
                    Res.drawable.red_rocket_art1,
                    Res.drawable.red_rocket_art2)
            ),
            EventDecision(
                decisionId = 5,
                decisionName = "",
                buttonText = " ",
                decisionMessages = listOf(
                    ""),
                decisionImages = listOf(
                    Res.drawable.red_rocket_art1,
                    Res.drawable.red_rocket_art2)
            ),
            EventDecision(
                decisionId = 6,
                decisionName = "",
                buttonText = "",
                decisionMessages = listOf(
                    ""),
                decisionImages = listOf(
                    Res.drawable.red_rocket_art1,
                    Res.drawable.red_rocket_art2)
            )
        )
    }*/
}