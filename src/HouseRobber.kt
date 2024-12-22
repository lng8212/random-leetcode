import kotlin.math.max

//https://leetcode.com/problems/house-robber/description/
/**
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 */

fun rob(nums: IntArray): Int {
    val dp = IntArray(nums.size + 1) { 0 }
    if (nums.size == 1) return nums[0]
    if (nums.size == 2) return max(nums[0], nums[1])
    dp[0] = nums[0]
    dp[1] = max(nums[0], nums[1])
    for (i in 2 until nums.size) {
        dp[i] = max(dp[i - 1], (dp[i - 2] + nums[i]))
    }
    return dp[nums.size - 1]
}

fun main() {
    println(rob(intArrayOf(2,7,9,3,1)))
}