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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.facial_scan
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import ui.components.FacialScan.FacialScanComponent
import ui.ui_values.GameColors
import ui.ui_values.GameFontSizes
import kotlin.coroutines.EmptyCoroutineContext

private var _bottom1Text = MutableValue("Please Wait")
private var _bottom2Text = MutableValue("")
@Composable
fun FacialScanScreen(component: FacialScanComponent) {
    val gameFontSizes = GameFontSizes()
    val gameColors = GameColors()

    var bottom1Text:Value<String> = _bottom1Text
    var bottom2Text:Value<String> = _bottom2Text

    var timerRun = MutableValue(true)


    val brush = Brush.radialGradient(listOf(Color.Red, Color.Black))
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush),
    ){
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                fontSize = 25.sp,
                color = gameColors.TextWhite,
                textAlign = TextAlign.Center,
                text = "Facial Scan in Progress",
            )
            Image(
                painter = painterResource(Res.drawable.facial_scan),
                alpha = .15f,
                contentDescription = null
            )
            Text(
                text = _bottom1Text.value,
                fontSize = gameFontSizes.normalLarge,
                color = gameColors.TextWhite,
                textAlign = TextAlign.Center,
            )
            Text(
                text = _bottom2Text.value,
                fontSize = gameFontSizes.normalLarge,
                color = gameColors.TextWhite,
                textAlign = TextAlign.Center,
            )
        }
    }

    if (_bottom1Text.value == "Loading CEO Profile"){
        _bottom1Text.value = "Please Wait"
        timerRun.value = true
    }

    CoroutineScope(EmptyCoroutineContext).launch() {
            while (timerRun.value) {
                if (_bottom1Text.value != "Loading CEO Profile" &&
                    _bottom2Text.value != "Thank you for your Patience!"
                    ){
                    if (_bottom1Text.value.length < 25) {
                        delay(300)
                        _bottom1Text.value = _bottom1Text.value + "."
                    } else if (_bottom1Text.value.length == 25) {
                        delay(300)
                        _bottom1Text.value = _bottom1Text.value + "COMPLETE!"
                        _bottom2Text.value = "Downloading User Data"
                    } else if (_bottom1Text.value.length > 35) {
                        _bottom1Text.value = "Please Wait..............COMPLETE!"
                    } else if (_bottom2Text.value.length < 32) {
                        delay(300)
                        _bottom2Text.value = _bottom2Text.value + "."
                    } else if (_bottom2Text.value.length >= 32) {
                        _bottom2Text.value = "Downloading User Data..........COMPLETE!"
                        timerRun.value = false
                    }
                }
            }
        delay(800)
        withContext(Dispatchers.Main) {
            component.onTimerEnd()
            _bottom1Text.value = "Loading CEO Profile"
            _bottom2Text.value = "Thank you for your Patience!"
            this.cancel()
        }
    }.start()
}