package data.models

data class GameEvent(
    var eventName: String,
    var eventId: Int,
    var eventLocation: String,

    var eventPreDecisionMessage1: String,
    var eventPreDecisionMessage2: String,
    var eventPreDecisionMessage3: String,
    var eventPreDecisionMessage4: String,
    var eventPreDecisionMessage5: String,

    var preDecisionImage1: Int,
    var preDecisionImage2: Int,
    var preDecisionImage3: Int,
    var preDecisionImage4: Int,
    var preDecisionImage5: Int,

    var eventDecision1: EventDecision,
    var eventDecision2: EventDecision,
    var eventDecision3: EventDecision,
    var eventDecision4: EventDecision,
    var eventDecision5: EventDecision,
    var eventDecision6: EventDecision
)
