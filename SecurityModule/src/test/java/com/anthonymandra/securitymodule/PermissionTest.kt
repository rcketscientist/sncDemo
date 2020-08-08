package com.anthonymandra.securitymodule

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class PermissionTest {
    private lateinit var permission1: Permission
    private lateinit var permission2: Permission

    private val page1 = Webpage("http://test.1")
    private val page2 = Webpage("http://test.2")
    private val page3 = Webpage("http://test.3")

    private val pages1 = arrayOf(page1)
    private val pages2 = arrayOf(page2, page3)

    @Before
    fun setUp() {
        permission1 = Permission(*pages1)
        permission2 = Permission(*pages2)
    }
//
    @Test
    fun getId() {
    }

    @Test
    fun canAccess() {
    }

    @Test
    fun addPage() {
    }

    @Test
    fun removePage() {
    }

    @Test
    fun accessiblePages() {
    }
}