@file:OptIn(ExperimentalResourceApi::class)

package ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.generic_money_bkg1
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import ui.components.GameSpaceScreenComponent
import ui.components.GameScreenEvent

var eventMessageNumber: Int = 0
@OptIn(ExperimentalResourceApi::class)
@Composable
fun GameScreen(component: GameSpaceScreenComponent) {
    val eventMessage by component.eventMessage.subscribeAsState()
    val eventImage by component.eventImage.subscribeAsState()
    val button1Text by component.button1Text.subscribeAsState()
    val button2Text by component.button1Text.subscribeAsState()
    val button3Text by component.button1Text.subscribeAsState()
    val button4Text by component.button1Text.subscribeAsState()
    val button5Text by component.button1Text.subscribeAsState()
    val button6Text by component.button6Text.subscribeAsState()

    val companyFinances by component.companyFinances.subscribeAsState()

    Box (modifier = Modifier
        .fillMaxSize()
        .paint(
            painter = painterResource(Res.drawable.generic_money_bkg1),
            contentScale = ContentScale.FillHeight
        )
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            GameScreenImageRow(painterResource(eventImage), companyFinances)
            GameScreenTextStatusRow(eventMessage)
            GameScreenDecisionButtonsRow(
                component,
                button1Text,
                button2Text,
                button3Text,
                button4Text,
                button5Text,
                button6Text
            )
        }
    }
}

@Composable
fun GameScreenImageRow(painter: Painter, companyFinances: Double) {

    Column(
        modifier = Modifier
            .fillMaxHeight(.38f)
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(30.dp, 30.dp, 30.dp, 30.dp))
            .background(Color.hsv(244f, .5f, .5f, .6f))
    ) {
        Text(text = "$$companyFinances",
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.Green,
            modifier = Modifier
                .fillMaxHeight(.1f)
                .fillMaxWidth()
                .padding(top = 2.dp)
                .clip(shape = RoundedCornerShape(30.dp, 30.dp, 30.dp, 30.dp))
                .background(Color.hsv(244f, .5f, .5f, .6f))
        )
        Row(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(vertical = 5.dp, horizontal = 5.dp)
                )
         {
            Column (modifier = Modifier.fillMaxWidth(.15f)){
                Text(
                    text = "Crew:",
                    modifier = Modifier,
                    Color.White,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Time:",
                            modifier = Modifier,
                    Color.White,
                    textAlign = TextAlign.Center
                )
                Text(text = "Dest:",
                    modifier = Modifier,
                    Color.White,
                    textAlign = TextAlign.Center
                )
                Text(text = "Hull:",
                    modifier = Modifier,
                    Color.White,
                    textAlign = TextAlign.Center
                )
                Text(text = "Engines:",
                    modifier = Modifier,
                    Color.White,
                    textAlign = TextAlign.Center
                )
                Text(text = "Sensors:",
                    modifier = Modifier,
                    Color.White,
                    textAlign = TextAlign.Center
                )
            }
            Image(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(.85f)
                    .padding(3.dp),
                painter = painter,
                contentScale = ContentScale.FillHeight,
                contentDescription = null
            )
            Spacer(modifier = Modifier.fillMaxWidth())
        }
    }
}

@Composable
fun GameScreenTextStatusRow(eventMessage: String) {
    //Text and Status Screen Row
    Row(modifier = Modifier
        .fillMaxHeight(.27f)
        .fillMaxWidth()
        .padding(top = 5.dp, start = 5.dp, end = 5.dp)
        .clip(shape = RoundedCornerShape(10.dp, 10.dp, 10.dp, 10.dp))
        .background(Color.hsv(10f,.1f,.1f,.5f))
    ) {
        Column {
            Row (modifier = Modifier
                .padding(3.dp)
                .clip(shape = RoundedCornerShape(10.dp, 10.dp, 10.dp, 10.dp))
                .background(Color.hsv(5f,.7f,.3f,.9f))
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth(.75f)
                        .fillMaxHeight()
                        .padding(vertical = 2.dp, horizontal = 7.dp),
                    color = Color.White,
                    text = eventMessage
                )
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(2.5.dp)
                        .clip(shape = RoundedCornerShape(15.dp, 15.dp, 15.dp, 15.dp))
                    ,
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.hsv(80f,0f,1f,.85f)),
                    onClick = {}
                ) {
                    Text(modifier = Modifier,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Black,
                        color = Color.hsv(244f,1f,.7f,1f),
                        fontSize = 12.sp,
                        text = "Company Status")
                }
            }
        }
    }
}

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
                        component.onEvent(GameScreenEvent.ClickButton3,
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
                )} ,
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