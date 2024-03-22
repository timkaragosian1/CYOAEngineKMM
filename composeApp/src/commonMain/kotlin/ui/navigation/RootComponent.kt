@file:OptIn(ExperimentalResourceApi::class, ExperimentalDecomposeApi::class)

package ui.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.pushNew
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.ExperimentalResourceApi
import ui.components.CreditsScreenComponent
import ui.components.GameSpaceScreenComponent
import ui.components.TitleScreenComponent

class RootComponent(
    componentContext: ComponentContext
): ComponentContext by componentContext {
    private val navigation = StackNavigation<Configuration>()
    val childStack = childStack(
        source = navigation,
        serializer = Configuration.serializer(),
        initialConfiguration = Configuration.TitleScreen,
        handleBackButton = true,
        childFactory = ::createChild
    )

    private fun createChild(
        config: Configuration,
        context: ComponentContext
    ): Child {
        return when(config){
            Configuration.TitleScreen -> Child.TitleScreen(
                    TitleScreenComponent(
                        componentContext = context,
                        onNavigateToCreditsScreen = {
                            navigation.pushNew(Configuration.CreditsScreen)
                        },
                        onNavigateToGameScreen = {
                            navigation.pushNew(Configuration.GameSpaceScreen)
                        }
                    ),
                )
            is Configuration.CreditsScreen -> Child.CreditsScreen(
                CreditsScreenComponent(
                    componentContext = context,
                    onNavigateBackToTitleScreen = {
                        navigation.pop()
                    }
                ),
            )
            is Configuration.GameSpaceScreen -> Child.GameSpaceScreen(
                GameSpaceScreenComponent(
                    componentContext = context,
                    onClickButton1 = {},
                    onClickButton2 = {},
                    onClickButton3 = {},
                    onClickButton4 = {},
                    onClickButton5 = {},
                    onClickButton6 = {
                        if(false){
                            navigation.pop()
                        }
                    }
                )
            )
        }
    }

    sealed class Child {
        data class TitleScreen(val component: TitleScreenComponent):Child()
        data class CreditsScreen(val component: CreditsScreenComponent):Child()
        data class GameSpaceScreen(val component: GameSpaceScreenComponent):Child()
    }

    @Serializable
    sealed class Configuration {
        @Serializable
        data object TitleScreen: Configuration()

        @Serializable
        data object CreditsScreen: Configuration()

        @Serializable
        data object GameSpaceScreen: Configuration()
    }
}