package basic.viii_interoper;

/**
 * Interop with java
 */

public class Customer {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String myString() {
        return "My string";
    }

    public String myNullableString() {
        return "My nullable string";
    }
}
