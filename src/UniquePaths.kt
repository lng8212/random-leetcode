//https://leetcode.com/problems/unique-paths/description/

fun uniquePaths(m: Int, n: Int): Int {
    val dp = Array(m + 1) {
        IntArray(n + 1) {
            0
        }
    }

    for (i in 1..m) {
        for (j in 1..n) {
            if(i == 1 || j ==1) dp[i][j] = 1
            else dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
        }
    }
    return dp[m][n]
}

fun main() {
    print(uniquePaths(3, 7))
}