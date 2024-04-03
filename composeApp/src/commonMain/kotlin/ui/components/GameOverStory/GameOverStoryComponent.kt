package ui.components.GameOverStory

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.arkivanov.decompose.ComponentContext

class GameOverStoryComponent(
        componentContext: ComponentContext,
        private val onNavigateBackToTitleScreen: () -> Unit
): ComponentContext by componentContext {
    @Composable
    fun getUserActions() {
        Text(
            text = "Sample User Action Line",
            color = Color.White,
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp,
        )
    }

    @Composable
    fun getCompanyCEOStory() {
        Text(
            text = "Sample Company Story Line",
            color = Color.White,
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp,
            )
    }

    fun backToTitleScreen() {
        onNavigateBackToTitleScreen()
    }
}