package advanced.ii_class_scenarios

/**
 * Nested classes
 */


class Directory(var user: String) {
    
    // Nested class
    class PermissionCheck {
        fun validateUser(user: String): Boolean {
            return true
        }
        
    }
    
    // Inner class
    private class OtherPermissionCheck { // Using private the nested class becomes encapsulated
        fun validateUser(user: String): Boolean {
            return true
        }
        
    }
    
    // Inner class
    private inner class AnotherPermissionCheck { // Using `inner` the nested class becomes inner class and can access properties from host class
        fun validateUser(user: String): Boolean {
            return true
        }
        
    }
    
    fun listFolder(folder: String, user: String) {
        val permissionCheck = Directory.PermissionCheck()
        permissionCheck.validateUser(user)
    }
    
}

fun main(args: Array<String>) {
}
