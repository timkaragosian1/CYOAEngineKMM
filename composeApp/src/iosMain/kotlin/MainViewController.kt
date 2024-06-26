import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import ui.navigation.RootComponent
import data.db_source.DatabaseDriverFactory

fun MainViewController() = ComposeUIViewController {
    val root = remember {
        RootComponent(DefaultComponentContext(LifecycleRegistry()), DatabaseDriverFactory())
    }
    App(root)
}
