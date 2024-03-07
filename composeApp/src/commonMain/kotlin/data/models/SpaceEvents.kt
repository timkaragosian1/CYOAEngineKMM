package data.models

class SpaceEvents {
    fun getListSpaceEvents(): List<GameEvent>{
        var spaceEventList: List<GameEvent> = listOf(
            getObjectCollisionSpaceEvent(),
            getCrewMemberPsychosisSpaceEvent(),
            getEngineMalfunctionSpaceEvent()
        )
        return spaceEventList
    }

    fun getObjectCollisionSpaceEvent():GameEvent{
        return GameEvent(
            eventName = "Object Collision",
            eventId = 1,
            eventLocation = "Space",

            eventPreDecisionMessage5 = "As you continue your adventure through space...",
            eventPreDecisionMessage1 = "Your ship is hit by an object in space and there is a hole in the ship near a non-critical area.",
            eventPreDecisionMessage2 = "There is not immediate danger to the the ship or crew from it, but the hull is compromised. What do you do?",
            eventPreDecisionMessage3 = "",
            eventPreDecisionMessage4 = "",

            preDecisionImage1 = 0,
            preDecisionImage2 = 0,
            preDecisionImage3 = 0,
            preDecisionImage4 = 0,
            preDecisionImage5 = 0,

            eventDecision1 = EventDecision(
                decisionId = 1,
                decisionName = "patchShip",
                decisionText = "Patch Up Ship",
                onDecisionSelected = {},
                postDecisionImage1 = 0,
                postDecisionImage2 = 0,
                postDecisionImage3 = 0,
                postDecisionImage4 = 0,
                postDecisionImage5 = 0,
                postDecisionMessage1 = "You Chose to Patch Up the Ship. You shutoff the engines and properly seal the damage.",
                postDecisionMessage2 = "It took awhile but it was the right thing to do. The ship's integrity is maintained.",
                postDecisionMessage3 = "",
                postDecisionMessage4 = "",
                postDecisionMessage5 = ""
            ),
            eventDecision2 = EventDecision(
                decisionId = 0,
                decisionName = "doNothing",
                decisionText = "Do nothing and continue flight",
                onDecisionSelected = {},
                postDecisionImage1 = 0,
                postDecisionImage2 = 0,
                postDecisionImage3 = 0,
                postDecisionImage4 = 0,
                postDecisionImage5 = 0,
                postDecisionMessage1 = "The company can't wait for costly, unnecessary repairs. The ship seems fine overall.",
                postDecisionMessage2 = "You continue the path to maximize profits and minimize time waste.",
                postDecisionMessage3 = "",
                postDecisionMessage4 = "",
                postDecisionMessage5 = ""
            ),
            eventDecision3 = EventDecision(
                decisionId = 0,
                decisionName = "",
                decisionText = "",
                onDecisionSelected = {},
                postDecisionImage1 = 0,
                postDecisionImage2 = 0,
                postDecisionImage3 = 0,
                postDecisionImage4 = 0,
                postDecisionImage5 = 0,
                postDecisionMessage1 = "",
                postDecisionMessage2 = "",
                postDecisionMessage3 = "",
                postDecisionMessage4 = "",
                postDecisionMessage5 = ""
            ),
            eventDecision4 = EventDecision(
                decisionId = 0,
                decisionName = "",
                decisionText = "",
                onDecisionSelected = {},
                postDecisionImage1 = 0,
                postDecisionImage2 = 0,
                postDecisionImage3 = 0,
                postDecisionImage4 = 0,
                postDecisionImage5 = 0,
                postDecisionMessage1 = "",
                postDecisionMessage2 = "",
                postDecisionMessage3 = "",
                postDecisionMessage4 = "",
                postDecisionMessage5 = ""
            ),
            eventDecision5 = EventDecision(
                decisionId = 0,
                decisionName = "",
                decisionText = "",
                onDecisionSelected = {},
                postDecisionImage1 = 0,
                postDecisionImage2 = 0,
                postDecisionImage3 = 0,
                postDecisionImage4 = 0,
                postDecisionImage5 = 0,
                postDecisionMessage1 = "",
                postDecisionMessage2 = "",
                postDecisionMessage3 = "",
                postDecisionMessage4 = "",
                postDecisionMessage5 = ""
            ),
            eventDecision6 = EventDecision(
                decisionId = 0,
                decisionName = "",
                decisionText = "",
                onDecisionSelected = {},
                postDecisionImage1 = 0,
                postDecisionImage2 = 0,
                postDecisionImage3 = 0,
                postDecisionImage4 = 0,
                postDecisionImage5 = 0,
                postDecisionMessage1 = "",
                postDecisionMessage2 = "",
                postDecisionMessage3 = "",
                postDecisionMessage4 = "",
                postDecisionMessage5 = ""
            )
        )
    }

    fun getCrewMemberPsychosisSpaceEvent():GameEvent {
        return GameEvent(
            eventName = "Crew Member Psychosis",
            eventId = 2,
            eventLocation = "Space",

            eventPreDecisionMessage1 = "A member of the crew begins suffering from space psychosis",
            eventPreDecisionMessage2 = "He is causing problems and has begun getting violent with other crewmates",
            eventPreDecisionMessage3 = "",
            eventPreDecisionMessage4 = "",
            eventPreDecisionMessage5 = "",

            preDecisionImage1 = 0,
            preDecisionImage2 = 0,
            preDecisionImage3 = 0,
            preDecisionImage4 = 0,
            preDecisionImage5 = 0,

            eventDecision1 = EventDecision(
                decisionId = 1,
                decisionName = "OutTheAirlock",
                decisionText = "Toss him out the Airlock",
                onDecisionSelected = {},
                postDecisionImage1 = 0,
                postDecisionImage2 = 0,
                postDecisionImage3 = 0,
                postDecisionImage4 = 0,
                postDecisionImage5 = 0,
                postDecisionMessage1 = "He was too problematic to keep around.",
                postDecisionMessage2 = "Your intention was to keep everyone in line",
                postDecisionMessage3 = "But instead it lowered morale and raised stress",
                postDecisionMessage4 = "",
                postDecisionMessage5 = ""
            ),
            eventDecision2 = EventDecision(
                decisionId = 2,
                decisionName = "RestrainHim",
                decisionText = "Restrain Him",
                onDecisionSelected = {},
                postDecisionImage1 = 0,
                postDecisionImage2 = 0,
                postDecisionImage3 = 0,
                postDecisionImage4 = 0,
                postDecisionImage5 = 0,
                postDecisionMessage1 = "The remaining crew restrains him and locks him in his crew quarters.",
                postDecisionMessage2 = "He is offered appropriate rations and his mind heals after a few months of proper therapy.",
                postDecisionMessage3 = "",
                postDecisionMessage4 = "",
                postDecisionMessage5 = ""
            ),
            eventDecision3 = EventDecision(
                decisionId = 0,
                decisionName = "",
                decisionText = "",
                onDecisionSelected = {},
                postDecisionImage1 = 0,
                postDecisionImage2 = 0,
                postDecisionImage3 = 0,
                postDecisionImage4 = 0,
                postDecisionImage5 = 0,
                postDecisionMessage1 = "",
                postDecisionMessage2 = "",
                postDecisionMessage3 = "",
                postDecisionMessage4 = "",
                postDecisionMessage5 = ""
            ),
            eventDecision4 = EventDecision(
                decisionId = 0,
                decisionName = "",
                decisionText = "",
                onDecisionSelected = {},
                postDecisionImage1 = 0,
                postDecisionImage2 = 0,
                postDecisionImage3 = 0,
                postDecisionImage4 = 0,
                postDecisionImage5 = 0,
                postDecisionMessage1 = "",
                postDecisionMessage2 = "",
                postDecisionMessage3 = "",
                postDecisionMessage4 = "",
                postDecisionMessage5 = ""
            ),
            eventDecision5 = EventDecision(
                decisionId = 0,
                decisionName = "",
                decisionText = "",
                onDecisionSelected = {},
                postDecisionImage1 = 0,
                postDecisionImage2 = 0,
                postDecisionImage3 = 0,
                postDecisionImage4 = 0,
                postDecisionImage5 = 0,
                postDecisionMessage1 = "",
                postDecisionMessage2 = "",
                postDecisionMessage3 = "",
                postDecisionMessage4 = "",
                postDecisionMessage5 = ""
            ),
            eventDecision6 = EventDecision(
                decisionId = 0,
                decisionName = "",
                decisionText = "",
                onDecisionSelected = {},
                postDecisionImage1 = 0,
                postDecisionImage2 = 0,
                postDecisionImage3 = 0,
                postDecisionImage4 = 0,
                postDecisionImage5 = 0,
                postDecisionMessage1 = "",
                postDecisionMessage2 = "",
                postDecisionMessage3 = "",
                postDecisionMessage4 = "",
                postDecisionMessage5 = ""
            ),
        )
    }

    fun getEngineMalfunctionSpaceEvent():GameEvent {
            return GameEvent(
                eventName = "Engine Malfunction",
                eventId = 3,
                eventLocation = "Space",

                eventPreDecisionMessage1 = "Your engine begins having issues mid-flight",
                eventPreDecisionMessage2 = "You are forced to shutdown and evaluate what to do...",
                eventPreDecisionMessage3 = "",
                eventPreDecisionMessage4 = "",
                eventPreDecisionMessage5 = "",

                preDecisionImage1 = 0,
                preDecisionImage2 = 0,
                preDecisionImage3 = 0,
                preDecisionImage4 = 0,
                preDecisionImage5 = 0,

                eventDecision1 = EventDecision(
                    decisionId = 1,
                    decisionName = "Extensive",
                    decisionText = "Extensive Repairs",
                    onDecisionSelected = {},
                    postDecisionImage1 = 0,
                    postDecisionImage2 = 0,
                    postDecisionImage3 = 0,
                    postDecisionImage4 = 0,
                    postDecisionImage5 = 0,
                    postDecisionMessage1 = "You spend a ton of time fixing up the engine and you realize that there are opportunities to improve it.",
                    postDecisionMessage2 = "You now have a more capable engine tuning it to space flight by using your new knowledge.",
                    postDecisionMessage3 = "",
                    postDecisionMessage4 = "",
                    postDecisionMessage5 = ""
                ),
                eventDecision2 = EventDecision(
                    decisionId = 2,
                    decisionName = "Standard",
                    decisionText = "Standard Service",
                    onDecisionSelected = {},
                    postDecisionImage1 = 0,
                    postDecisionImage2 = 0,
                    postDecisionImage3 = 0,
                    postDecisionImage4 = 0,
                    postDecisionImage5 = 0,
                    postDecisionMessage1 = "You repair only what is needed. It takes a little bit of time.",
                    postDecisionMessage2 = "You engine seems about the same as before the malfunction and you are on your way.",
                    postDecisionMessage3 = "",
                    postDecisionMessage4 = "",
                    postDecisionMessage5 = ""
                ),
                eventDecision3 = EventDecision(
                    decisionId = 3,
                    decisionName = "Minimal",
                    decisionText = "Minimal rigging",
                    onDecisionSelected = {},
                    postDecisionImage1 = 0,
                    postDecisionImage2 = 0,
                    postDecisionImage3 = 0,
                    postDecisionImage4 = 0,
                    postDecisionImage5 = 0,
                    postDecisionMessage1 = "You made a bad decisions and got it working ASAP",
                    postDecisionMessage2 = "It is letting you continue your adventure, but who knows for how long...",
                    postDecisionMessage3 = "",
                    postDecisionMessage4 = "",
                    postDecisionMessage5 = ""
                ),
                eventDecision4 = EventDecision(
                    decisionId = 0,
                    decisionName = "",
                    decisionText = "",
                    onDecisionSelected = {},
                    postDecisionImage1 = 0,
                    postDecisionImage2 = 0,
                    postDecisionImage3 = 0,
                    postDecisionImage4 = 0,
                    postDecisionImage5 = 0,
                    postDecisionMessage1 = "",
                    postDecisionMessage2 = "",
                    postDecisionMessage3 = "",
                    postDecisionMessage4 = "",
                    postDecisionMessage5 = ""
                ),
                eventDecision5 = EventDecision(
                    decisionId = 0,
                    decisionName = "",
                    decisionText = "",
                    onDecisionSelected = {},
                    postDecisionImage1 = 0,
                    postDecisionImage2 = 0,
                    postDecisionImage3 = 0,
                    postDecisionImage4 = 0,
                    postDecisionImage5 = 0,
                    postDecisionMessage1 = "",
                    postDecisionMessage2 = "",
                    postDecisionMessage3 = "",
                    postDecisionMessage4 = "",
                    postDecisionMessage5 = ""
                ),
                eventDecision6 = EventDecision(
                    decisionId = 0,
                    decisionName = "",
                    decisionText = "",
                    onDecisionSelected = {},
                    postDecisionImage1 = 0,
                    postDecisionImage2 = 0,
                    postDecisionImage3 = 0,
                    postDecisionImage4 = 0,
                    postDecisionImage5 = 0,
                    postDecisionMessage1 = "",
                    postDecisionMessage2 = "",
                    postDecisionMessage3 = "",
                    postDecisionMessage4 = "",
                    postDecisionMessage5 = ""
                ),
            )
    }

    fun getRandomSpaceScene(): GameEvent{
        return getListSpaceEvents().random()
    }
}