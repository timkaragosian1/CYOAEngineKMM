package ui.components.ViewModels

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import ui.components.NamesSelectScreenEvent
import ui.components.TitleScreenEvent
import ui.navigation.RootComponent

class NamesSelectScreenComponent(
    componentContext: ComponentContext,
    private val onNavigateToGameScreen: () -> Unit,
    val rootComponent: RootComponent
): ComponentContext by componentContext {

    private var _gameCEOFirstname = MutableValue("")
    var gameCEOFirstname: Value<String> = _gameCEOFirstname

    private var _gameCEOLastname = MutableValue("")
    var gameCEOLastname: Value<String> = _gameCEOLastname

    private var _gameCompanyName = MutableValue("")
    var gameCompanyName: Value<String> = _gameCompanyName

    fun onEvent(event: NamesSelectScreenEvent){
        if (gameCEOFirstname.value.isNotEmpty() &&
            gameCEOLastname.value.isNotEmpty() &&
            gameCompanyName.value.isNotEmpty()) {
            rootComponent.setCEOAndCompanyNames(
                gameCEOFirstname.value,
                gameCEOLastname.value,
                gameCompanyName.value
            )
            when(event){
                NamesSelectScreenEvent.ClickSubmitNamesButton -> onNavigateToGameScreen()
            }
        }
    }

    fun setCEOFirstname (ceoFirstname:String){
        _gameCEOFirstname.value = ceoFirstname
    }

    fun setCEOLastname (ceoLastName:String){
        _gameCEOLastname.value = ceoLastName
    }

    fun setCompanyName (companyName:String){
        _gameCompanyName.value = companyName
    }

    fun resetNameData() {
        _gameCEOFirstname.value = ""
        _gameCEOLastname.value = ""
        _gameCompanyName.value = ""
    }
}