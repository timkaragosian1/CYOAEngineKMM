@file:OptIn(ExperimentalResourceApi::class)

package ui.components.TitleScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cyoaenginekmm.composeapp.generated.resources.Res
import cyoaenginekmm.composeapp.generated.resources.titlescreen_main_title
import cyoaenginekmm.composeapp.generated.resources.titlescreen_sub_title
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource

@Composable
fun TitleScreenTitleText() {
    val offset = Offset(4.0f, 4.0f)
    Spacer(modifier = Modifier.fillMaxHeight(.05f))
    Text(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(15.dp, 15.dp, 15.dp, 15.dp))
            .background(Color.hsv(244f, .5f, .2f, .3f))
            .padding(horizontal = 15.dp),
        textAlign = TextAlign.Center,
        color = Color.White,
        fontWeight = FontWeight.Bold,
        fontSize = 50.sp,
        text = stringResource( Res.string.titlescreen_main_title),
        style = TextStyle(
            fontSize = 60.sp,
            shadow = Shadow(
                color = Color.Black, offset = offset, blurRadius = 8f
            )
        )
    )
    //Spacer(modifier = Modifier.fillMaxHeight(.001f))
    Text(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(10.dp, 10.dp, 10.dp, 10.dp))
            .background(Color.hsv(244f, .5f, .2f, .3f))
            .padding(horizontal = 15.dp),
        textAlign = TextAlign.Center,
        color = Color.White,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        text = stringResource(Res.string.titlescreen_sub_title),
        style = TextStyle(
            fontSize = 40.sp,
            shadow = Shadow(
                color = Color.Black, offset = offset , blurRadius = 8f
            )
        )
    )
}