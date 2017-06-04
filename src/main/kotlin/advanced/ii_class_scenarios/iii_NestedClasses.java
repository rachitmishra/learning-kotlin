package advanced.ii_class_scenarios;

/**
 * Nested classes
 */

public class iii_NestedClasses {


    public static void main(String[] args) {
        Directory.PermissionCheck permissionCheck = new Directory.PermissionCheck(); // Accessing nested class from java
        permissionCheck.validateUser("My user");
    }
}
