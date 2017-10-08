package rx1

import io.reactivex.Observable
import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.ListView
import javafx.scene.control.TextField
import javafx.scene.layout.VBox
import javafx.stage.Stage
import java.util.concurrent.TimeUnit

class App : Application() {
    
    override fun start(stage: Stage) {
        val edit = TextField()
        val completionList = ListView<String>()
        val viewBox = VBox(edit, completionList).apply {
            spacing = 15.0
            padding = Insets(15.0)
        }
        
        stage.scene = Scene(viewBox)
        
        stage.show()
    }
}

fun main(args: Array<String>) {
    val clock = Observable.timer(1, TimeUnit.SECONDS)
    val v0 = 3
    clock.scan(v0, { t1, t2 -> t1 }).subscribe {
    
    }
}
