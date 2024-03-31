@file:OptIn(ExperimentalResourceApi::class)

package ui.components.GameScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import org.jetbrains.compose.resources.ExperimentalResourceApi
import ui.Values.GameColors
import ui.Values.GameDimensions
import ui.Values.GameFontSizes
import ui.Values.GameShapes


@Composable
fun GameScreenDecisionButtonsRow(
    component: GameScreenComponent,
    button1Text:String,
    button2Text:String,
    button3Text:String,
    button4Text:String,
    button5Text:String,
    button6Text:String,
) {
    val gameDimensions = GameDimensions()
    val gameColors = GameColors()
    val gameShapes = GameShapes()
    val gameFontSizes = GameFontSizes()

    //Buttons Screen Row
    Row(modifier = Modifier
        .fillMaxHeight(.92f)
        .fillMaxWidth()
        .padding(top = gameDimensions.large, bottom = gameDimensions.small, start = gameDimensions.small, end = gameDimensions.small)
        .clip(shape = gameShapes.normalRoundedRectangle)
        .background(gameColors.BlackShadowScreen)
        ,
        horizontalArrangement = Arrangement.Center,
    ) {
        //Buttons
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(top = gameDimensions.default)
                    .fillMaxHeight(.333f)
            ) {
                DecisionButton(
                    { component.onEvent(
                        GameScreenEvent.ClickButton1,
                        component.button1NextEvent.value)} ,
                    button1Text,
                    .5f,
                    component.button1Enabled.value,
                    gameDimensions,
                    gameShapes,
                    gameColors,
                    gameFontSizes
                )
                DecisionButton(
                    { component.onEvent(
                        GameScreenEvent.ClickButton2,
                        component.button2NextEvent.value)
                    }
                    ,button2Text, 1f,
                    component.button2Enabled.value,
                    gameDimensions,
                    gameShapes,
                    gameColors,
                    gameFontSizes
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(top = gameDimensions.default)
                    .fillMaxHeight(.5f)
            ) {
                DecisionButton(
                    {
                        component.onEvent(
                            GameScreenEvent.ClickButton3,
                            component.button3NextEvent.value,
                        )
                    },
                    button3Text,
                    .5f,
                    component.button3Enabled.value,
                    gameDimensions,
                    gameShapes,
                    gameColors,
                    gameFontSizes
                )
                DecisionButton(
                    { component.onEvent(
                        GameScreenEvent.ClickButton4,
                        component.button4NextEvent.value,
                    )
                    } ,
                    button4Text,
                    1f,
                    component.button4Enabled.value,
                    gameDimensions,
                    gameShapes,
                    gameColors,
                    gameFontSizes
                )
            }

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(top = gameDimensions.default)
                    .fillMaxHeight()
            ) {
                DecisionButton(
                    {
                        component.onEvent(
                            GameScreenEvent.ClickButton5,
                            component.button5NextEvent.value)
                    } ,
                    button5Text,
                    .5f,
                    component.button5Enabled.value,
                    gameDimensions,
                    gameShapes,
                    gameColors,
                    gameFontSizes
                )
                DecisionButton(
                    { component.onEvent(
                        GameScreenEvent.ClickButton6,
                        component.button6NextEvent.value)
                    } ,
                    button6Text,
                    1f,
                    component.button6Enabled.value,
                    gameDimensions,
                    gameShapes,
                    gameColors,
                    gameFontSizes
                )
            }
        }
    }
}

@Composable
fun DecisionButton(
    onClick: () -> Unit,
    text:String,
    widthFraction:Float,
    enabled:Boolean,
    gameDimensions: GameDimensions,
    gameShapes: GameShapes,
    gameColors: GameColors,
    gameFontSizes: GameFontSizes
) {
    Button(modifier = Modifier
        .fillMaxWidth(widthFraction)
        .fillMaxHeight(.95f)
        .padding(top = gameDimensions.default, start = gameDimensions.small, end = gameDimensions.small)
        .clip(shape = gameShapes.semiSmallRoundedRectangle)
        .alpha(
            if (enabled){
                1f
            } else {
                0f
            }
        )
        ,
        colors = ButtonDefaults.buttonColors(backgroundColor = gameColors.GameButtonBlue),
        onClick = if (enabled) {
            onClick
        } else {
            {}
        }
    ) {
        Text(
            textAlign = TextAlign.Center,
            fontSize = gameFontSizes.normal,
            color = gameColors.TextWhite,
            text = if (enabled) {
                text
            } else {
                ""
            }
        )
    }
}