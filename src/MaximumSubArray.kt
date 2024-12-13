//https://leetcode.com/problems/maximum-subarray/
fun maxSubArray(nums: IntArray): Int {
    if (nums.size == 1) return nums[0]
    var current = nums[0]
    var result = current
    for (i in 1 until nums.size) {
        if (current + nums[i] > nums[i]) current += nums[i]
        else current = nums[i]
        if (current > result) result = current
    }
    return result
}

fun main() {
    println(maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4)))
}