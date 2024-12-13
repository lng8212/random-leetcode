//https://leetcode.com/problems/product-of-array-except-self/description/
fun productExceptSelf(nums: IntArray): IntArray {
    val ans = IntArray(nums.size)
    var mul = 1
    for (i in nums.indices) {
        ans[i] = mul
        mul *= nums[i]
    }
    mul = 1
    for (i in nums.indices.reversed()) {
        ans[i] *= mul
        mul *= nums[i]
    }
    return ans
}
// 1  -1 -1  0 0
//
fun main() {
    println(productExceptSelf(intArrayOf(-1, 1, 0, -3, 3)).joinToString())
}