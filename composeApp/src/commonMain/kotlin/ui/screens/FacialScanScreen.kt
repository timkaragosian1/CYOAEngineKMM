package ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import ui.Utils.GameTimer
import ui.Values.GameColors
import ui.Values.GameFontSizes
import ui.components.ViewModels.FacialScanComponent

@Composable
fun FacialScanScreen(component: FacialScanComponent) {
    val gameFontSizes = GameFontSizes()
    val gameColors = GameColors()

    GameTimer(
        updateInterface = {component.onTimerEnd() }
    ).startOnce(1500)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    ){
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                fontSize = gameFontSizes.large,
                color = gameColors.TextWhite,
                textAlign = TextAlign.Center,
                text = "FACIAL SCAN IN PROGRESS\nPLEASE WAIT UNTIL\nPROCESS COMPLETES!"
            )
        }
    }
}