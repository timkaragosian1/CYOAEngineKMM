package ui.components.GameScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
 @Composable
    fun GameScreenImageStatusRow(
        painter: Painter,
        companyFinances: Long,
        gameShipCrewCondition:Int,
        gameShipHullCondition:Int,
        gameShipEngineCondition:Int,
        gameShipSensorsCondition:Int,
        gameShipDestination:String,
        gameTime:Double
    ) {

        Column(
            modifier = Modifier
                .fillMaxHeight(.38f)
                .fillMaxWidth()
                .padding(horizontal = 5.dp)
                .clip(shape = RoundedCornerShape(30.dp, 30.dp, 30.dp, 30.dp))
                .background(Color.hsv(244f, .5f, .4f, .70f))
        ) {
            Row (
                modifier = Modifier
                    .fillMaxHeight(.1f)
                    .fillMaxWidth()
                    .padding(top = 2.dp)
                    .clip(shape = RoundedCornerShape(30.dp, 30.dp, 30.dp, 30.dp))
                    .background(Color.hsv(244f, .5f, .3f, .6f))
            ){
                Text(text = "$",
                    textAlign = TextAlign.Right,
                    fontWeight = FontWeight.Black,
                    fontSize = 20.sp,
                    color = Color.Green,
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(.15f)
                )
                Text(text = "$companyFinances",
                    textAlign = TextAlign.Right,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    letterSpacing = 3.sp,
                    color = Color.Green,
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(.70f)
                )
                Text(text = ".00",
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    letterSpacing = 3.sp,
                    color = Color.Green,
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .padding(end = 50.dp)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .padding(vertical = 5.dp, horizontal = 2.dp)
            )
            {
                Column (
                    modifier = Modifier.fillMaxWidth(.2f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Spacer(modifier = Modifier.height(25.dp))
                    Text(
                        text = "CREW",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        //style = TextStyle(textDecoration = TextDecoration.Underline),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                    getGameStatusTextView(gameShipCrewCondition)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "TIME",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        //style = TextStyle(textDecoration = TextDecoration.Underline),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                    Text(
                        text = gameTime.toString(),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = Color.Green
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "DEST",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                    Text(
                        text = gameShipDestination,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = Color.LightGray
                    )
                }
                Image(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(.78f)
                        .padding(1.dp),
                    painter = painter,
                    contentScale = ContentScale.FillHeight,
                    contentDescription = null
                )
                Column (modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Spacer(modifier = Modifier.height(25.dp))
                    Text(
                        text = "HULL",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        //style = TextStyle(textDecoration = TextDecoration.Underline),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                    getGameStatusTextView(gameShipHullCondition)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "ENGI",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        //style = TextStyle(textDecoration = TextDecoration.Underline),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                    getGameStatusTextView(gameShipEngineCondition)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "SENS",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        //style = TextStyle(textDecoration = TextDecoration.Underline),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )
                    getGameStatusTextView(gameShipSensorsCondition)
                }
            }
        }
    }

    @Composable
    fun getGameStatusTextView(gameShipCrewCondition: Int) {
        return Text(
            text =
            if (gameShipCrewCondition==1){
                "CRIT"
            } else if (gameShipCrewCondition==2){
                "POOR"
            } else if (gameShipCrewCondition==3){
                "NORM"
            } else if (gameShipCrewCondition==4){
                "GOOD"
            } else if (gameShipCrewCondition==5){
                "GREA"
            } else if (gameShipCrewCondition==6){
                "OPTI"
            } else {
                "UNKN"
            },
            color =
            if (gameShipCrewCondition==1){
                Color.Red
            } else if (gameShipCrewCondition==2){
                Color.Yellow
            } else if (gameShipCrewCondition==3){
                Color.Black
            } else if (gameShipCrewCondition==4){
                Color.Green
            } else if (gameShipCrewCondition==5){
                Color.Blue
            } else if (gameShipCrewCondition==6){
                Color.Cyan
            } else {
                Color.LightGray
            },
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
        )
    }
