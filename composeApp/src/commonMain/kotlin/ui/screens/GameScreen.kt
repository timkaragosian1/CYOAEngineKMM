@file:OptIn(ExperimentalResourceApi::class)

package ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.generic_money_bkg1
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import ui.components.GameScreen.GameScreenDecisionButtonsRow
import ui.components.ViewModels.GameSpaceScreenComponent
import ui.components.GameScreen.GameScreenImageStatusRow
import ui.components.GameScreen.GameScreenTextRow

var eventMessageNumber: Int = 0
@OptIn(ExperimentalResourceApi::class)
@Composable
fun GameScreen(component: GameSpaceScreenComponent) {
    val eventMessage by component.eventMessage.subscribeAsState()
    val eventImage by component.eventImage.subscribeAsState()
    val button1Text by component.button1Text.subscribeAsState()
    val button2Text by component.button2Text.subscribeAsState()
    val button3Text by component.button3Text.subscribeAsState()
    val button4Text by component.button4Text.subscribeAsState()
    val button5Text by component.button5Text.subscribeAsState()
    val button6Text by component.button6Text.subscribeAsState()

    val companyFinances by component.companyFinances.subscribeAsState()
    val gameShipCrewCondition by component.gameCrewStatus.subscribeAsState()
    val gameShipHullCondition by component.gameShipHull.subscribeAsState()
    val gameShipEngineCondition by component.gameShipEngines.subscribeAsState()
    val gameShipSensorsCondition by component.gameShipSensors.subscribeAsState()
    val gameShipDestination by component.gameShipDestination.subscribeAsState()
    val gameTime by component.gameTime.subscribeAsState()
    val gameStatus by component.gameStatus.subscribeAsState()


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
            GameScreenImageStatusRow(
                painterResource(eventImage),
                companyFinances,
                gameShipCrewCondition,
                gameShipHullCondition,
                gameShipEngineCondition,
                gameShipSensorsCondition,
                gameShipDestination,
                gameTime
                )
            GameScreenTextRow(eventMessage)
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
