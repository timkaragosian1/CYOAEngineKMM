package ui.components.FacialScan

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import ui.ui_values.GameColors
import ui.ui_values.GameFontSizes
import kotlin.coroutines.EmptyCoroutineContext

class FacialScanComponent(
    componentContext: ComponentContext,
    private val onNavigateToGameScreen: () -> Unit,
): ComponentContext by componentContext {
    var facialScanTextProgress = MutableValue("")
    var downloadUserDataTextProgress = MutableValue("")
    fun onTimerEnd(){
        onNavigateToGameScreen()
    }

    @Composable
    fun getSimulationFacialScanTextProgress() {
        if (facialScanTextProgress.value.length > 25) {
            facialScanTextProgress.value = "Please Wait"
        }

        CoroutineScope(EmptyCoroutineContext).launch() {
            repeat(10) {
                delay(200)
                if (facialScanTextProgress.value.length < 25) {
                    facialScanTextProgress.value = facialScanTextProgress.value + "."
                } else if (facialScanTextProgress.value.length == 25) {
                    facialScanTextProgress.value = facialScanTextProgress.value + "COMPLETE!"
                } else {

                }
            }
        }.start()

        Text(
            text = facialScanTextProgress.value,
            fontSize = GameFontSizes().normalLarge,
            color = GameColors().TextWhite,
            textAlign = TextAlign.Center,
        )
    }


    @Composable
    fun getSimulationDownloadUserDataTextProgress() {

    }
}