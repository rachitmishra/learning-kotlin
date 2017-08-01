package datastructures


data class BankAccount(var accountNumber: String, var balance: Double = 100.00)

fun main(args: Array<String>) {
// Question: is it better to invest $100 over 10 years at 5%
// or to invest $100 over 20 years at 2.5% interest?
    val jd = BankAccount("Jain Dough")
    val js = BankAccount("Jon Smythe")
    for (years in 1..10)
        jd.balance = jd.balance * 0.05
    for (years in 1..20)
        js.balance = js.balance * 0.025
    println("Jain invests $100 over 10 years at 5%.")
    println("After 10 years ${jd.accountNumber} has $${jd.balance}")
    println("Jon invests $100 over 20 years at 2.5%.")
    println("After 20 years ${js.accountNumber} has $${js.balance}")
}

