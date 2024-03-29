package ui.components.ViewModels

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import ui.components.NameSelectScreen.NamesScreenValues
import ui.components.NameSelectScreen.NamesSelectScreenEvent
import ui.navigation.RootComponent

class NamesSelectScreenComponent(
    componentContext: ComponentContext,
    private val onNavigateToFacialScanScreen: () -> Unit,
    isButtonEnabled: Boolean,
    private val rootComponent: RootComponent
): ComponentContext by componentContext {

    private var _gameCEOFirstname = MutableValue("")
    var gameCEOFirstname: Value<String> = _gameCEOFirstname

    private var _gameCEOLastname = MutableValue("")
    var gameCEOLastname: Value<String> = _gameCEOLastname

    private var _gameCompanyName = MutableValue("")
    var gameCompanyName: Value<String> = _gameCompanyName

    private var _isButtonEnabled = MutableValue(isButtonEnabled)
    var isButtonEnabled: Value<Boolean> = _isButtonEnabled

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
                NamesSelectScreenEvent.ClickSubmitNamesButton -> onNavigateToFacialScanScreen()
            }
        }
    }

    fun setIsButtonEnabled(isButtonEnabled:Boolean){
        _isButtonEnabled.value = isButtonEnabled
    }

    fun getRandomFirstName(){
        _gameCEOFirstname.value = NamesScreenValues().getRandomFirstName()
    }

    fun getRandomLastName(){
        _gameCEOLastname.value = NamesScreenValues().getRandomLastName()
    }

    fun getRandomCompanyName(){
        _gameCompanyName.value = NamesScreenValues().getRandomCompanyName()
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