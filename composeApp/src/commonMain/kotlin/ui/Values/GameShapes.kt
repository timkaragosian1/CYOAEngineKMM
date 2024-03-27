package ui.Values

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

data class GameShapes(
    val default:Shape = RoundedCornerShape(10.dp, 10.dp, 10.dp, 10.dp),
    val barelyRoundedRectange:Shape = RoundedCornerShape(1.dp, 1.dp, 1.dp, 1.dp),
    val smallRoundedRectangle:Shape = RoundedCornerShape(10.dp, 10.dp, 10.dp, 10.dp),
    val semiSmallRoundedRectangle:Shape = RoundedCornerShape(15.dp, 15.dp, 15.dp, 15.dp),
    val normalRoundedRectangle:Shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp),
    val extraRoundedRectangle:Shape = RoundedCornerShape(30.dp, 30.dp, 30.dp, 30.dp)
)
