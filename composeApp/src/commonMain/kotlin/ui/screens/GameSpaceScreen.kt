package ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.SpaceBackground1
import cyoaenginekmm.composeapp.generated.resources.rocket
import cyoaenginekmm.composeapp.generated.resources.spacefield_a_000
import cyoaenginekmm.composeapp.generated.resources.spacescreen_title
import cyoaenginekmm.composeapp.generated.resources.titlescreen_credits_button
import cyoaenginekmm.composeapp.generated.resources.titlescreen_main_title
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.components.GameSpaceScreenComponent
import ui.components.GameSpaceScreenEvent
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState

@OptIn(ExperimentalResourceApi::class)
@Composable
fun GameSpaceScreen(component: GameSpaceScreenComponent) {
    /**
     * These are the planned features to include:
     *
     * - BUTTON/MESSAGE FLEXIBILITY
     *      If there are additional messages beyond the first, then button 6 should be "NEXT"
     *      "NEXT" Button loads the next message
     *      If there is no further additional messages, then load the button names as normal
     * - BUTTONS LOAD NEXT EVENT
     *      - Will need a function to give me the the conclusion messaging of the decision
     *      - After the messages are complete, the "NEXT" Button changes to "Continue Adventure"
     *      - "Continue Adventure" picks a random event to load for the player
     */

    val titleText by component.titleText.subscribeAsState()
    val eventStartMessage1Text by component.eventStartMessage1Text.subscribeAsState()

    val button1Text by component.button1Text.subscribeAsState()


    Box (modifier = Modifier
        .fillMaxSize()
        .paint(
            painter = painterResource(Res.drawable.SpaceBackground1),
            contentScale = ContentScale.FillBounds
        )
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                text = titleText,
                modifier = Modifier.padding(20.dp)
            )
            Image(
                modifier = Modifier.padding(20.dp),
                painter = painterResource(Res.drawable.rocket),
                contentDescription = null
            )
            Text(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                text = eventStartMessage1Text,
                modifier = Modifier.padding(20.dp)
            )
            Row {
                Button(
                    onClick = {
                        component.onEvent(GameSpaceScreenEvent.ClickButton1)
                              },
                    modifier = Modifier.padding(5.dp)
                ){
                    Text(text = button1Text)
                }
                Button(
                    onClick = {
                        component.onEvent(GameSpaceScreenEvent.ClickButton2)
                    },
                    modifier = Modifier.padding(5.dp)
                ){
                    Text(text = component.button2Text.value)
                }
            }
            Row {
                Button(
                    onClick = {
                        component.onEvent(GameSpaceScreenEvent.ClickButton3)
                    },
                    modifier = Modifier.padding(5.dp)
                ){
                    Text(text = component.button3Text.value)
                }
                Button(
                    onClick = {
                        component.onEvent(GameSpaceScreenEvent.ClickButton4)
                    },
                    modifier = Modifier.padding(5.dp)
                ){
                    Text(text = component.button4Text.value)
                }
            }
            Row {
                Button(
                    onClick = {
                        component.onEvent(GameSpaceScreenEvent.ClickButton5)
                    },
                    modifier = Modifier.padding(5.dp)
                ){
                    Text(text = component.button5Text.value)
                }
                Button(
                    onClick = {
                        component.onEvent(GameSpaceScreenEvent.ClickButton6)
                    },
                    modifier = Modifier.padding(5.dp)
                ){
                    Text(text = component.button6Text.value)
                }
            }
        }
    }
}