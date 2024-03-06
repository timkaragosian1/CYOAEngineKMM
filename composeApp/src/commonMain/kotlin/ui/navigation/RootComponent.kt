package ui.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.push
import com.arkivanov.decompose.router.stack.pushNew
import kotlinx.serialization.Serializable
import ui.components.ScreenAComponent
import ui.components.ScreenBComponent

class RootComponent(
    componentContext: ComponentContext
): ComponentContext by componentContext {
    private val navigation = StackNavigation<Configuration>()
    val childStack = childStack(
        source = navigation,
        serializer = Configuration.serializer(),
        initialConfiguration = Configuration.ScreenA,
        handleBackButton = true,
        childFactory = ::createChild
    )

    private fun createChild(
        config: Configuration,
        context: ComponentContext
    ): Child {
        return when(config){
            Configuration.ScreenA -> Child.ScreenA(
                ScreenAComponent(
                    componentContext = context,
                    onNavigateToScreenB = { text ->
                        navigation.pushNew(Configuration.ScreenB(text))
                    }
                ),

            )
            is Configuration.ScreenB -> Child.ScreenB(
                ScreenBComponent(
                    text = config.text,
                    componentContext = context,
                    onGoBack = {
                        navigation.pop()
                    }
                )
            )
        }
    }

    sealed class Child {
        data class ScreenA(val component: ScreenAComponent):Child()
        data class ScreenB(val component: ScreenBComponent):Child()
    }

    @Serializable
    sealed class Configuration {
        @Serializable
        data object ScreenA: Configuration() // data object doesn't take anything in, title screen candidate

        @Serializable
        data class ScreenB(val text:String): Configuration() //data class allows data to be passed in, not sure anything needs to be data class at this time
    }
}