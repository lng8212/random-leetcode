//https://leetcode.com/problems/longest-increasing-subsequence/description/

fun lengthOfLIS(nums: IntArray): Int {
    val dp = IntArray(nums.size)
    dp[0] = 1
    for (i in 1 until nums.size) {
        var maxValueSmallerThanCurrent = -Int.MAX_VALUE
        for (j in 0 until i) {
            if (nums[j] < nums[i]) {
                if (maxValueSmallerThanCurrent < dp[j]) {
                    maxValueSmallerThanCurrent = dp[j]
                }
            }
        }
        if (maxValueSmallerThanCurrent != -Int.MAX_VALUE) {
            dp[i] = maxValueSmallerThanCurrent + 1
        } else dp[i] = 1
    }
    return dp.max()
}

fun main() {
    print(lengthOfLIS(intArrayOf(1,3,6,7,9,4,10,5,6)))
}