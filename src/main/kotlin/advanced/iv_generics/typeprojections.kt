package advanced.iv_generics

/**
 * Type projections
 */

// kotlin uses declaration-site variance (in, out modifiers on call)
// java has use-site variance (modifiers on call

// kotlin has use-site variance, defined on call, which creates restricted type of call
// star projections are safer way of indicating a subtype of a projection


fun copy(list: MutableList<out String>) { // use-site variance

}

fun main(args: Array<String>) {
    var element = ""
    // f (element is List<*>) // element of type *
}
