package com.jlt.controller

import com.jlt.service.DocumentService
import io.ktor.application.ApplicationCall
import io.ktor.response.respondText

class DocumentController(private val documentService: DocumentService) {
    suspend fun get(ctx: ApplicationCall) {
        ctx.respondText(documentService.getDocument())
    }
}