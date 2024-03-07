package data.models

import androidx.compose.ui.graphics.ImageBitmap
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value

data class EventDecision(
    var decisionId: Int,
    var decisionName: String,
    var decisionText: String,
    var onDecisionSelected: () -> Unit,

    var postDecisionMessage1: String,
    var postDecisionMessage2: String,
    var postDecisionMessage3: String,
    var postDecisionMessage4: String,
    var postDecisionMessage5: String,

    var postDecisionImage1: Int,
    var postDecisionImage2: Int,
    var postDecisionImage3: Int,
    var postDecisionImage4: Int,
    var postDecisionImage5: Int
)
