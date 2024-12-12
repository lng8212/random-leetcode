fun getSum(a: Int, b: Int): Int {
    var a1 = a
    var b1 = b
    while (b1 != 0) {
        val carry = a1 and b1
        a1 = a1 xor b1
        b1 = carry shl 1
    }
    return a1
}

fun main() {
    println(getSum(3,5))
}