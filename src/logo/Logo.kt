package logo

import react.*
import react.dom.*
import kotlinext.js.*
import kotlinx.html.style

@JsModule("src/logo/react.svg")
external val reactLogo: dynamic
@JsModule("src/logo/kotlin.svg")
external val kotlinLogo: dynamic

fun RBuilder.logo(height: Int = 100) {
    div("logo") {
        attrs.jsStyle.height = height
        img(alt = "React logo.logo", src = reactLogo, classes = "logo-react") {}
        img(alt = "Kotlin logo.logo", src = kotlinLogo, classes = "logo-kotlin") {}
    }
}
