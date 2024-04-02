package ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState
import com.arkivanov.decompose.value.MutableValue
import ui.components.LoadingScreen.LoadingScreenComponent

private var _loadingProgressText = MutableValue("Please Wait")

@Composable
fun LoadingScreen(component: LoadingScreenComponent) {
    var loadingProgressText = component.loadingProgressText.subscribeAsState()

    var checkVerUserActionUploadProgress = 0
    var dBDownloadProgress = 0

    Column (
        modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        component.loadMockedProgress()

        /*val handler = CoroutineExceptionHandler { _, exception ->
            println("CoroutineExceptionHandler got $exception")
        }

        CoroutineScope(EmptyCoroutineContext).launch(handler) {
                delay(500)
                if (_loadingProgressText.value.length < 25) {
                    _loadingProgressText.value = loadingProgressText.value + "."
                } else if (_loadingProgressText.value.length == 25) {
                    _loadingProgressText.value = loadingProgressText.value + "COMPLETE!"
                }
            delay(800)
            withContext(Dispatchers.Main) {
                component.onLoadDataComplete()
            }
        }.start()*/

        Text(text = "Loading Screen")
        Text(text = "We'll have your data soon!")
        Text(text = "Tasks being mocked:")
        Text(text = "Upload User Data and onComplete returns DB ver number")
        Text(text = "Check against current DB Ver Number")
        Text(text = "If newer, download and load new DB")
        Text(text = "If same or older, do nothing")
        Text(text = "Navigate to Title Screen")
        Text(text = loadingProgressText.value)
    }
}