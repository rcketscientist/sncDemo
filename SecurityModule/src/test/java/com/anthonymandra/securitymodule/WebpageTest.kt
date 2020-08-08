package com.anthonymandra.securitymodule

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.BeforeClass
import kotlin.properties.Delegates

class WebpageTest {
    private lateinit var page1: Webpage
    private lateinit var page2: Webpage

    private val url1 = "http://test.me"
    private val url2 = "http://test.you"

    @Before
    fun setUp() {
        page1 = Webpage("http://test.me")
        page2 = Webpage("http://test.you")
    }

    @Test
    fun getId() {
        assertNotEquals(page1.id, page2.id)
    }


    @Test
    fun getUrl() {
        assertEquals(page1.url, url1)
        assertEquals(page2.url, url2)
    }
}