import kotlin.math.min

fun coinChange(coins: IntArray, amount: Int): Int {
    val dp = IntArray(amount + 1){-1}
    dp[0] = 0
    for (i in 1 .. amount){
        var minx = Int.MAX_VALUE
        for(value in coins){
            if(i - value >= 0 && dp[i-value] != -1){
                minx = min(minx, 1 + dp[i-value])
            }

        }
        dp[i] = if(minx == Int.MAX_VALUE) -1 else minx
    }
    return dp[amount]
}

fun main() {
    print(coinChange(intArrayOf(2,5,5),11))
}