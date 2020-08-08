package com.anthonymandra.securitymodule

class Role (
    val name: String,
    permissions: List<Permission>
) {
    val id = nextId++
    private val permissions = permissions.toMutableList()

    fun addPermission(permission: Permission) {
        this.permissions.add(permission)
    }

    fun removePermission(permission: Permission) {
        this.permissions.remove(permission)
    }

    fun permissions(): List<Permission> {
        return this.permissions
    }

    companion object {
        var nextId = 0  // It's quite possible this would need to be defined else-wise, but this is the simplest method
    }
}
