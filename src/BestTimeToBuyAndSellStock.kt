import kotlin.math.max
import kotlin.math.min

fun maxProfit(prices: IntArray): Int {
    var minValue: Int = Int.MAX_VALUE
    var ans = 0
    for (i in 1 until prices.size) {
        minValue = min(prices[i - 1], minValue)
        ans = max(ans, prices[i] - minValue)

    }
    return ans
}

fun main() {
    println(maxProfit(intArrayOf(7,6,4,3,1)))
}