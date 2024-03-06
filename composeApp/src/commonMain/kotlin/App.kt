import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.slide
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.navigation.RootComponent

import ui.screens.CYOAGameApp
import ui.screens.ScreenA
import ui.screens.ScreenB

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App(root: RootComponent) {
    MaterialTheme {
        //CYOAGameApp()
        val childStack by root.childStack.subscribeAsState()
        Children(
            stack = childStack,
            animation = stackAnimation(slide())
        ){
            child ->
            when(val instance = child.instance){
                is RootComponent.Child.ScreenA -> ScreenA(instance.component)
                is RootComponent.Child.ScreenB -> ScreenB(instance.component)
            }
        }
        /**
         * THIS IS THE TO DO LIST IN ORDER FOR THIS ENGINE'S COMPLETION TO BECOME C-COMMERCE:
         *      - Implement Decompose library for Navigation and ViewModel use: https://www.youtube.com/watch?v=g4XSWQ7QT8g
         *          - Definition of Done:
         *              - Title Screen Buttons load Space Screen (fade) and Credit Screens (slide)
         *              - Credit Screen back to Title Screen (slide)
         *      - Space Screen loads a endless "game" of 1 of 5 random events where a decision must be made and a result is loaded before more decisions must be made
         *          - Definition of Done:
         *              - The above is achieved all programatically in the commonMain Kotlin as the model for MVVM pattern
         *              - Buttons are reflexive in enabling and disabling and possibly animate in and out
         *              - Images and text animate in and out as well
         *      - Implement SQL Delight to house the data to be loaded in the game and queries for the events: https://www.youtube.com/watch?v=1w-LTUm_iDE&t=4491s, https://github.com/UR-Prospects-LLC/draftcard-mobile/blob/add_sqldelight/composeApp/build.gradle.kts
         *          - Definition of Done:
         *              - Events are driven from the SQL Delight database rather than programatically from Kotlin
         *              - The DB is a major part of the model with an interface for queries called in the ViewModel
         *      - Figure out Main Quests
         *          - Definition of Done:
         *              - Main Quests follow a path in the game
         *              - Paths go to a celestial object after a certain amount of space travel events
         *              - There are then the same amount of space travel events back to complete
         *              - Only words indicate what transpires at the locations
         *                  - you pick up valuables, you sold them on earth, etc
         *              - The player should then be able to endlessly begin the quest again
         *              - Implement a dollar amount bar for company "money"
         *                  - Interesting Thought: Is the the company money equal to company/player health?
         *      - Expand to other Locations
         *          - Definition of Done:
         *              - Main Quest begins at Earth
         *              - There is a launch event that is handled to get to space
         *              - There is a landing event on the celestial body
         *              - There is a launch event from the celestial body of choice
         *              - There is a landing event back on earth
         *              - The player should then be able to endlessly begin the quest again
         *      - Implement Simple UI Style
         *          - Definition of Done:
         *              - Implement animations
         *              - Update Visuals to have a consistent style
         *              - Integrate the story into the visuals as much as possible
         *              - Style with appropriate colors
         *      - Polish Gameplay and Story
         *          - Definition of Done:
         *              - Immerse the player in the game
         *                  - Make them feel in control and lead them into wanting to know more about THEIR story
         *                  - Make it feel it is representing THEM
         *              - Increase variety of events
         *              - Multiple "Good", "Bad", and "Neutral" endings
         *              - Create an adventure time limit to complete quests
         *              - First launch of game is just like selecting start game
         *      - Begin Testing for Viability and Feedback
         *          - Definition of Done:
         *              - Test for stability and bugs as much as can be
         *              - Allow others to beta test and give feedback
         *              - Develop Unit Tests to ensure everything is working as expected
         *              - Expand Unit Tests as bugs are found
         *              - Collect Feedback suggestions to evaluate
         *              - Allow multiple kinds of gamers to try for varitey of feedback
         */
    }
}