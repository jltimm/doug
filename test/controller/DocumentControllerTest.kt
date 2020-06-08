package com.jlt.controller

import com.jlt.module
import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication
import org.junit.Test
import kotlin.test.assertEquals

class DocumentControllerTest {
    @Test
    fun testRoot() {
        withTestApplication({ module() }) {
            handleRequest(HttpMethod.Get, "/document").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("Test", response.content)
            }
        }
    }
}
