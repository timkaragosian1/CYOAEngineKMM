package ui.values

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class GameDimensions(
    val default:Dp = 2.dp,
    val extraSmall:Dp = 3.dp,
    val small:Dp = 5.dp,
    val normal:Dp = 7.dp,
    val large:Dp = 10.dp,
    val extraLarge: Dp = 15.dp,
    val giant:Dp = 20.dp,
    val extraGiant:Dp = 25.dp
)
