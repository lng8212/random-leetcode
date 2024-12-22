//https://leetcode.com/problems/combination-sum-iv/description/

fun combinationSum4(nums: IntArray, target: Int): Int {
    val dp = IntArray(target + 1) { 0 }
    dp[0] = 1
    for (i in 1 .. target) {
        for (j in nums.indices) {
            if (i - nums[j] >= 0) {
                dp[i] += dp[i - nums[j]]
            }
        }
    }
    return dp[target]
}

fun main() {
    println(combinationSum4(intArrayOf(1,2,3), target = 4))
}