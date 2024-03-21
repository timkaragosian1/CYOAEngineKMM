@file:OptIn(ExperimentalResourceApi::class)

package data.models

import androidx.compose.ui.graphics.ImageBitmap
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

data class EventDecision(
    var decisionButtonId: Int,
    var decisionName: String,
    var buttonText: String,
    var nextEventId: Int,
    var enabled: Boolean,
)
