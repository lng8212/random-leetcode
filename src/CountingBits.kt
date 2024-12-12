fun countBits(n: Int): IntArray {
    val ans = IntArray(n + 1)
    ans[0] = 0
    var offset = 1
    for (i in 1..n) {
        if (offset * 2 == i) offset = i
        ans[i] = 1 + ans[i - offset]
    }
    return ans
}

fun main() {
    println(countBits(2).joinToString())
}