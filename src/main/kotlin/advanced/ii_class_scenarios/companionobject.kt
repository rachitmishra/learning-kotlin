package advanced.ii_class_scenarios

import advanced.ii_class_scenarios.Log.createLog2.createFileLog2

/**
 * Companion objects
 */

class Log private constructor() { // using private constructor this class can't be initialised
    object createLog { /* functions inside object can only be accessed using class instance*/
        fun createFileLog(fileName: String): Log =
                Log(fileName)
    }
    
    companion object createLog2 { /* functions of `companion` keyword class can be directly accessed */
        @JvmStatic fun createFileLog2(fileName: String): Log =
                Log(fileName)
        /* Using @JvmStatic we can access this function statically through java*/
    }
    
    
    constructor(fileName: String) : this()
}

fun main(args: Array<String>) {
    val log = Log.createLog.createFileLog("myName")
    /* functions inside object can only be accessed using object instance*/
    
    val log2 = createFileLog2("myName")
    // direct access to createFileLog(), bcz it is member of companion object
    // each class can only have one companion object
}
