package ui.ui_values

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

data class GameFontFamily(
    val default:FontFamily = FontFamily.SansSerif
)
data class GameFontSizes(
    val default:TextUnit = 12.sp,
    val normal:TextUnit = 16.sp,
    val normalLarge:TextUnit = 18.sp,
    val large:TextUnit = 20.sp,
    val giant:TextUnit = 50.sp,
    val extraGiant:TextUnit = 60.sp,
    )

