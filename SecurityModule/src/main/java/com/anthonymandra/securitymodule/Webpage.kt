package com.anthonymandra.securitymodule

class Webpage(
    val url: String // TODO: Ensure this is a URL
) {
    val id = Role.nextId++

    companion object {
        var nextId = 0  // It's quite possible this would need to be defined else-wise, but this is the simplest method
    }
}