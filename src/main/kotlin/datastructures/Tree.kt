package datastructures

data class Tree(var value:Int) {
    lateinit var left: Tree
    lateinit var right: Tree
    
    operator fun invoke(f: Tree.() -> Tree) {
    
    }
}
