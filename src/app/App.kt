package app

import react.*
import react.dom.*
import logo.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("app-header") {
            logo()
            h2 {
                +"Welcome to Code Artists"
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
