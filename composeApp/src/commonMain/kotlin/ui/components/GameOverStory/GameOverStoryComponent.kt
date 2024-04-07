package ui.components.GameOverStory

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import data.GameDateUtils
import data.models.GameStory
import data.models.UserAction

class GameOverStoryComponent(
    componentContext: ComponentContext,
    gameUserActionsList: ArrayList<UserAction>,
    gameStoryList: ArrayList<GameStory>,
    private val onNavigateBackToTitleScreen: () -> Unit
): ComponentContext by componentContext {
    val userActionsList = gameUserActionsList
    val storyList = gameStoryList

    val gameDateUtils = GameDateUtils()

    var gameTime = MutableValue(gameDateUtils.gameTimeMillis)

    @Composable
    fun getUserActions() {
        for (userActions in userActionsList){
            Text(
                text = "End of game: ${userActions.isEndOfGame}. Start of Game: ${userActions.isStartOfGame}. Next event: ${userActions.eventIdNext}. Notes: ${userActions.notes}, timestamp: ${userActions.timestamp}",
                color = Color.White,
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp,
                modifier = Modifier.padding(5.dp)
            )
        }
    }

    @Composable
    fun getCompanyCEOStory() {
        for (story in storyList){
            Text(
                text = "${gameDateUtils.epochMillisToFormattedString(story.inGameDate)}: ${story.storyText}",
                color = Color.White,
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp,
                modifier = Modifier.padding(5.dp)
            )
        }
    }

    fun backToTitleScreen() {
        onNavigateBackToTitleScreen()
    }
}