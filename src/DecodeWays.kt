//https://leetcode.com/problems/decode-ways/description/

/**
 * For example, "11106" can be decoded into:
 * "AAJF" with the grouping (1, 1, 10, 6)
 * "KJF" with the grouping (11, 10, 6)
 * The grouping (1, 11, 06) is invalid because "06" is not a valid code (only "6" is valid).
 */
fun numDecodings(s: String): Int {
    val dp = IntArray(s.length + 1) { 0 }
    if (s[0] == '0') return 0
    if (s.length == 1) return 1
    if (s.length == 2) {
        if (s[1] == '0') {
            return if (s[0] >= '3') 0
            else 1
        }
        if (s[0] == '1' || (s[0] <= '2' && s[1] <= '6' && s[1] > '0')) return 2
        else if (s[0] >= '3' && s[1] == '0') return 0
        return 1
    }
    dp[0] = 1
    if (s[1] == '0') {
        if (s[0] >= '3') dp[1] = 0
        else dp[1] = 1
    } else if (s[0] == '1' || (s[0] <= '2' && s[1] <= '6' && s[1] > '0')) dp[1] = 2
    else dp[1] = 1
    for (i in 2 until s.length) {
        if (s[i] != '0') {
            dp[i] = dp[i - 1]
            if (s[i - 1] == '1' || (s[i - 1] == '2' && s[i] <= '6')) dp[i] += dp[i - 2]
        } else {
            if (s[i - 1] == '1' || s[i - 1] == '2') dp[i] = dp[i - 2]
            else return 0
        }
    }
    return dp[s.length - 1]
}

fun main() {
    println(numDecodings("301"))
}