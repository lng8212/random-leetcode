//https://leetcode.com/problems/maximum-score-after-splitting-a-string/

import kotlin.math.max

fun maxScore(s: String): Int {
    var maxx = 0
    for (i in 0..s.length - 2) {
        val leftStr = s.substring(0, i + 1)
        val rightStr = s.substring(i + 1)
        val result = leftStr.count { it == '0' } + rightStr.count { it == '1' }
        maxx = max(result, maxx)
    }
    return maxx
}


fun main() {
    println(maxScore("011101"))
}