package com.jlt

import com.fasterxml.jackson.databind.SerializationFeature
import com.jlt.controller.DocumentController
import com.jlt.router.document
import com.jlt.service.DocumentService
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.jackson.jackson
import io.ktor.routing.Routing

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
fun Application.module() {

    val documentService = DocumentService()

    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }

    install(Routing) {
        document(DocumentController(documentService))
    }
}

