package com.anthonymandra.securitymodule

class User(
    val name: String,
    val role: Role  // Since a user can have only one role, I have not added CRUD, a new user could be created
) {
    val id = nextId++

    companion object {
        var nextId = 0  // It's quite possible this would need to be defined else-wise, but this is the simplest method
    }
}