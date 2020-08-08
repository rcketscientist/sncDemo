package com.anthonymandra.securitymodule

class Permission(
    // 1..n compliance
    accessiblePage: Webpage,
    vararg accessiblePages: Webpage
) {
    // TODO: are ids sufficient?
    // TODO: This should have some persistence, android room, etc.
    private val accessiblePages: MutableList<Webpage> = mutableListOf(accessiblePage, *accessiblePages)
    val id = nextId++

    // there's technically no need for userId
    fun canAccess(webpageId: Int): Boolean {
        return accessiblePages.any { page -> page.id == webpageId }
    }

    fun addPage(page: Webpage) {
        this.accessiblePages.add(page)
    }

    fun removePage(page: Webpage) {
        this.accessiblePages.remove(page)
    }

    fun accessiblePages(): List<Webpage> {
        return this.accessiblePages
    }

    companion object {
        var nextId = 0  // It's quite possible this would need to be defined else-wise, but this is the simplest method
    }
}
