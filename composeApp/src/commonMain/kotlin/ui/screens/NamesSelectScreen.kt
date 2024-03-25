@file:OptIn(ExperimentalResourceApi::class)

package ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.*
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.components.NamesSelectScreenEvent
import ui.components.TitleScreenButtons
import ui.components.ViewModels.TitleScreenComponent
import ui.components.TitleScreenEvent
import ui.components.TitleScreenTitleText
import ui.components.ViewModels.NamesSelectScreenComponent

@Composable
fun NamesSelectScreen(component: NamesSelectScreenComponent) {
    val gameCEOFirstname by component.gameCEOFirstname.subscribeAsState()
    val gameCEOLastname by component.gameCEOLastname.subscribeAsState()
    val gameCompanyName by component.gameCompanyName.subscribeAsState()

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
            val offset = Offset(4.0f, 4.0f)
            Text(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(15.dp, 15.dp, 15.dp, 15.dp))
                    .background(Color.hsv(244f, .5f, .2f, .3f))
                    .padding(horizontal = 15.dp),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 50.sp,
                text = stringResource(Res.string.nameselectscreen_title_text),
                style = TextStyle(
                    fontSize = 60.sp,
                    shadow = Shadow(
                        color = Color.Black, offset = offset, blurRadius = 8f
                    )
                )
            )
            Text(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(15.dp, 15.dp, 15.dp, 15.dp))
                    .background(Color.hsv(244f, .5f, .2f, .3f))
                    .padding(horizontal = 15.dp),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                text = stringResource(Res.string.nameselectscreen_subtitle_text),
                style = TextStyle(
                    fontSize = 60.sp,
                    shadow = Shadow(
                        color = Color.Black, offset = offset, blurRadius = 8f
                    )
                )
            )
            Spacer(modifier = Modifier.fillMaxHeight(.55f))
            TextField(
                value = gameCEOFirstname,
                onValueChange = { component.setCEOFirstname(it) },
                label = { Text(stringResource(Res.string.nameselectscreen_ceo_firstname)) },
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(1.dp, 1.dp, 1.dp, 1.dp))
                    .background(Color.hsv(244f, .0f, .95f, .65f))
            )
            TextField(
                value = gameCEOLastname,
                onValueChange = { component.setCEOLastname(it) },
                label = { Text(stringResource(Res.string.nameselectscreen_ceo_last_name)) },
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(1.dp, 1.dp, 1.dp, 1.dp))
                    .background(Color.hsv(244f, .0f, .95f, .65f))
            )
            TextField(
                value = gameCompanyName,
                onValueChange = { component.setCompanyName(it) },
                label = { Text(stringResource(Res.string.nameselectscreen_company_name)) },
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(1.dp, 1.dp, 1.dp, 1.dp))
                    .background(Color.hsv(244f, .0f, .95f, .65f))
            )
            Spacer(modifier = Modifier.fillMaxHeight(.15f))
            Button(
                onClick = {
                    component.onEvent(NamesSelectScreenEvent.ClickSubmitNamesButton)
                },
                modifier = Modifier
                    .fillMaxWidth(.5f)
                    .fillMaxHeight(.7f),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.hsv(
                        244f,
                        1f,
                        .5f,
                        .9f
                    )
                )
            ) {
                Text(
                    text = stringResource(Res.string.nameselectscreen_submit_button),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color.White
                )
            }
        }
    }
}