package com.jlt.router

import com.jlt.controller.DocumentController
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.route

fun Routing.document(documentController: DocumentController) {
    route("/document") {
        get { documentController.get(this.context) }
    }
}