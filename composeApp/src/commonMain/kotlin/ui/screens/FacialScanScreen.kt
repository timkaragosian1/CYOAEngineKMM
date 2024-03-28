@file:OptIn(ExperimentalResourceApi::class)

package ui.screens

import androidx.compose.foundation.Image
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
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.facial_scan
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import ui.Utils.GameTimer
import ui.Values.GameColors
import ui.Values.GameFontSizes
import ui.components.ViewModels.FacialScanComponent

private var _bottomText = MutableValue("Please Wait")
@Composable
fun FacialScanScreen(component: FacialScanComponent) {
    val gameFontSizes = GameFontSizes()
    val gameColors = GameColors()

    var bottomText:Value<String> = _bottomText

    GameTimer(
        updateInterface = {_bottomText.value = bottomText.value + "."}
    ).startRepeat(1500, 1)

    GameTimer(
        updateInterface = {component.onTimerEnd() }
    ).startOnce(2000)

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
                text = "Facial Scan in Progress"
            )
            Image(
                painter = painterResource(Res.drawable.facial_scan),
                contentDescription = null
            )
            Text(
                text = _bottomText.value
            )
        }
    }
}