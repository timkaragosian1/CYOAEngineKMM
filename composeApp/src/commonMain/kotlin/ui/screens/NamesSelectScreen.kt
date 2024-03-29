@file:OptIn(ExperimentalResourceApi::class)

package ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.usa_business_bkg
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import ui.components.NameSelectScreen.NameSelectScreenUIComponents
import ui.components.ViewModels.NamesSelectScreenComponent

@Composable
fun NamesSelectScreen(component: NamesSelectScreenComponent) {
    val gameCEOFirstname by component.gameCEOFirstname.subscribeAsState()
    val gameCEOLastname by component.gameCEOLastname.subscribeAsState()
    val gameCompanyName by component.gameCompanyName.subscribeAsState()
    val isButtonEnabled by component.isButtonEnabled.subscribeAsState()
    val nameSelectScreenUIComponents = NameSelectScreenUIComponents()

    Box (modifier = Modifier
        .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .paint(painter = painterResource(Res.drawable.usa_business_bkg),
                    contentScale = ContentScale.FillHeight
                )
        ) {
            nameSelectScreenUIComponents.NameSelectScreenTitleText()
            Spacer(modifier = Modifier.fillMaxHeight(.55f))
            nameSelectScreenUIComponents.NameSelectScreenTextFieldAndButtons(
                component,
                gameCEOFirstname,
                gameCEOLastname,
                gameCompanyName,
                isButtonEnabled
            )
        }
    }
}