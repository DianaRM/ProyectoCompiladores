@file:Suppress("UNREACHABLE_CODE")
package Aplicacion

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class Aplicacion: Application() {
    override fun start(primaryStage: Stage?) {

        val loader = FXMLLoader(Aplicacion :: class.java.getResource("/inicioNew2.fxml"))
        val parent:Parent = loader.load()

        val scene = Scene(parent)

        primaryStage?.scene = scene
        primaryStage?.title = "Mi compilador"
        primaryStage?.show()
    }
    companion object{

        @JvmStatic
        fun main( args: Array<String>){
            launch (Aplicacion::class.java)

        }

    }
}