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
import ui.Values.GameColors
import ui.Values.GameDimensions
import ui.Values.GameFontSizes
import ui.Values.GameShapes

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
        val gameColors = GameColors()
        val gameShapes = GameShapes()
        val gameDimensions = GameDimensions()
        val gameFontSizes = GameFontSizes()
        Column(
            modifier = Modifier
                .fillMaxHeight(.38f)
                .fillMaxWidth()
                .padding(horizontal = gameDimensions.small)
                .clip(shape = gameShapes.extraRoundedRectangle)
                .background(gameColors.ImageStatusScreen)
        ) {
            Row (
                modifier = Modifier
                    .fillMaxHeight(.1f)
                    .fillMaxWidth()
                    .padding(top = gameDimensions.default)
                    .clip(shape = gameShapes.extraRoundedRectangle)
                    .background(gameColors.FinancialHeader)
            ){
                Text(text = "$",
                    textAlign = TextAlign.Right,
                    fontWeight = FontWeight.Black,
                    fontSize = gameFontSizes.large,
                    color = Color.Green,
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(.15f)
                )
                Text(text = "$companyFinances",
                    textAlign = TextAlign.Right,
                    fontWeight = FontWeight.Bold,
                    fontSize = gameFontSizes.normalLarge,
                    letterSpacing = 3.sp,
                    color = Color.Green,
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(.70f)
                )
                Text(text = ".00",
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.Bold,
                    fontSize = gameFontSizes.normalLarge,
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
                    .padding(vertical = gameDimensions.small, horizontal = gameDimensions.default)
            )
            {
                Column (
                    modifier = Modifier.fillMaxWidth(.2f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Spacer(modifier = Modifier.height(gameDimensions.extraGiant))
                    Text(
                        text = "CREW",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = gameFontSizes.large,
                        //style = TextStyle(textDecoration = TextDecoration.Underline),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = gameColors.TextWhite
                    )
                    getGameStatusTextView(gameShipCrewCondition, gameColors, gameFontSizes)
                    Spacer(modifier = Modifier.height(gameDimensions.large))
                    Text(
                        text = "TIME",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = gameFontSizes.large,
                        //style = TextStyle(textDecoration = TextDecoration.Underline),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = gameColors.TextWhite
                    )
                    Text(
                        text = gameTime.toString(),
                        fontWeight = FontWeight.Bold,
                        fontSize = gameFontSizes.normal,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = Color.Green
                    )
                    Spacer(modifier = Modifier.height(gameDimensions.large))
                    Text(
                        text = "DEST",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = gameFontSizes.large,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = gameColors.TextWhite
                    )
                    Text(
                        text = gameShipDestination,
                        fontWeight = FontWeight.Bold,
                        fontSize = gameFontSizes.normal,
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
                    Spacer(modifier = Modifier.height(gameDimensions.extraGiant))
                    Text(
                        text = "HULL",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = gameFontSizes.large,
                        //style = TextStyle(textDecoration = TextDecoration.Underline),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = gameColors.TextWhite
                    )
                    getGameStatusTextView(gameShipHullCondition, gameColors, gameFontSizes)
                    Spacer(modifier = Modifier.height(gameDimensions.large))
                    Text(
                        text = "ENGI",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = gameFontSizes.large,
                        //style = TextStyle(textDecoration = TextDecoration.Underline),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = gameColors.TextWhite
                    )
                    getGameStatusTextView(gameShipEngineCondition, gameColors, gameFontSizes)
                    Spacer(modifier = Modifier.height(gameDimensions.large))
                    Text(
                        text = "SENS",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = gameFontSizes.large,
                        //style = TextStyle(textDecoration = TextDecoration.Underline),
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = gameColors.TextWhite
                    )
                    getGameStatusTextView(gameShipSensorsCondition, gameColors, gameFontSizes)
                }
            }
        }
    }

    @Composable
    fun getGameStatusTextView(gameShipCrewCondition: Int, gameColors:GameColors, gameFontSizes:GameFontSizes) {
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
                gameColors.Orange
            } else if (gameShipCrewCondition==4){
                Color.Green
            } else if (gameShipCrewCondition==5){
                Color.Blue
            } else if (gameShipCrewCondition==6){
                gameColors.Purple
            } else {
                Color.LightGray
            },
            fontWeight = FontWeight.Bold,
            fontSize = gameFontSizes.normal,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
        )
    }
