package ui

import com.arkivanov.decompose.ComponentContext


class LoadingScreenComponent(
    componentContext: ComponentContext,
    private val onLoadComplete: () -> Unit,
): ComponentContext by componentContext {

    fun onLoadDataComplete(){
        onLoadComplete()
    }
}