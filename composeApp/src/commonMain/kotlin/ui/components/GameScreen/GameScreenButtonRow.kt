@file:OptIn(ExperimentalResourceApi::class)

package ui.components.GameScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import ui.components.ViewModels.GameSpaceScreenComponent


@Composable
fun GameScreenDecisionButtonsRow(
    component: GameSpaceScreenComponent,
    button1Text:String,
    button2Text:String,
    button3Text:String,
    button4Text:String,
    button5Text:String,
    button6Text:String,
) {
    //Buttons Screen Row
    Row(modifier = Modifier
        .fillMaxHeight(.92f)
        .fillMaxWidth()
        .padding(top = 10.dp, bottom = 5.dp, start = 5.dp, end = 5.dp)
        .clip(shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp))
        .background(Color.hsv(0f,0f,.12f,.7f))
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
                    .padding(top = 2.5.dp)
                    .fillMaxHeight(.333f)
            ) {
                DecisionButton(
                    { component.onEvent(
                        GameScreenEvent.ClickButton1,
                        component.button1NextEvent.value)} ,
                    button1Text,
                    .5f,
                    component.button1Enabled.value)
                DecisionButton(
                    { component.onEvent(
                        GameScreenEvent.ClickButton2,
                        component.button2NextEvent.value)
                    }
                    ,button2Text, 1f,
                    component.button2Enabled.value
                )
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(top = 2.5.dp)
                    .fillMaxHeight(.5f)
            ) {
                DecisionButton(
                    {
                        component.onEvent(
                            GameScreenEvent.ClickButton3,
                            component.button3NextEvent.value)
                    },
                    button3Text,
                    .5f,
                    component.button3Enabled.value
                )
                DecisionButton(
                    { component.onEvent(
                        GameScreenEvent.ClickButton4,
                        component.button4NextEvent.value
                    )
                    } ,
                    button4Text,
                    1f,
                    component.button4Enabled.value
                )
            }

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(top = 2.5.dp)
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
                    component.button5Enabled.value
                )
                DecisionButton(
                    { component.onEvent(
                        GameScreenEvent.ClickButton6,
                        component.button6NextEvent.value)
                    } ,
                    button6Text,
                    1f,
                    component.button6Enabled.value
                )
            }
        }
    }
}

@Composable
fun DecisionButton(onClick: () -> Unit, text:String, widthFraction:Float, enabled:Boolean) {
    Button(modifier = Modifier
        .fillMaxWidth(widthFraction)
        .fillMaxHeight(.95f)
        .padding(top = 2.5.dp, start = 5.dp, end = 5.dp)
        .clip(shape = RoundedCornerShape(15.dp, 15.dp, 15.dp, 15.dp))
        .alpha(
            if (enabled){
                1f
            } else {
                0f
            }
        )
        ,
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.hsv(244f,1f,.5f,.9f)),
        onClick = if (enabled) {
            onClick
        } else {
            {}
        }
    ) {
        Text(
            textAlign = TextAlign.Center,
            color = Color.White,
            text = if (enabled) {
                text
            } else {
                ""
            }
        )
    }
}