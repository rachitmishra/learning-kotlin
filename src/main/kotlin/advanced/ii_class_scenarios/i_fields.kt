package advanced.ii_class_scenarios

/**
 * Fields
 */

class MyCustomer {
    
    private var myCustomField: Double = 0.0
    
    var lastPurchaseAmount: Double = 0.0
        get() = field
        set(value) {
            field = value // backing field is generated for a property
        }
}

fun main(args: Array<String>) {
    val customer = MyCustomer()
    customer.lastPurchaseAmount = 100.0
}
