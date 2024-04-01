package ui.components.LoadingScreen

import com.arkivanov.decompose.ComponentContext


class LoadingScreenComponent(
    componentContext: ComponentContext,
    private val onLoadingComplete: () -> Unit
): ComponentContext by componentContext {
    fun onLoadDataComplete(){
        onLoadingComplete()
    }
}