package ui.components.GameScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import ui.Values.GameColors
import ui.Values.GameDimensions
import ui.Values.GameFontSizes
import ui.Values.GameShapes

@Composable
fun GameScreenTextRow(eventMessage: String) {
    val gameColors = GameColors()
    val gameShapes = GameShapes()
    val gameDimensions = GameDimensions()
    val gameFontSizes = GameFontSizes()

    //Text Screen Row
    Row(modifier = Modifier
        .fillMaxHeight(.27f)
        .fillMaxWidth()
        .padding(top = gameDimensions.small, start = gameDimensions.small, end = gameDimensions.small)
        .clip(shape = gameShapes.smallRoundedRectangle)
        .background(gameColors.StoryTextBackgroundShadow)
    ) {
        Column {
            Row (modifier = Modifier
                .padding(3.dp)
                .clip(shape = gameShapes.smallRoundedRectangle)
                .background(gameColors.StoryTextBackgroundRed)
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(vertical = gameDimensions.default, horizontal = gameDimensions.normal),
                    fontSize = gameFontSizes.normal,
                    color = gameColors.TextWhite,
                    text = eventMessage
                )
            }
        }
    }
}
