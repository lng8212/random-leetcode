//https://leetcode.com/problems/jump-game/description/

fun canJump(nums: IntArray): Boolean {
    if(nums.size == 1) return true
    val dp = IntArray(nums.size )
    for (i in nums.indices) {
        if (i == 0 || dp[i] == 1) {
            for (j in 1..nums[i]) {
                if (i + j < nums.size - 1) {
                    dp[i + j] = 1
                } else if (i + j == nums.size - 1) return true
            }
        }
    }
    return false
}

fun main() {
    println(canJump(intArrayOf(3,2,1,0,4)))
}