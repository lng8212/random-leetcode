fun maxProduct(nums: IntArray): Int {
    if (nums.size == 1) return nums[0]
    var currentMax = nums[0]
    var currentMin = nums[0]
    var result = currentMax
    for (i in 1 until nums.size) {
        val tempMax = currentMax
        val tempMin = currentMin
        currentMax = maxOf(nums[i], nums[i] * tempMax, nums[i] * tempMin)
        currentMin = minOf(nums[i], nums[i] * tempMin, nums[i] * tempMax)
        result = maxOf(result, currentMax, currentMin)
    }
    return result
}

fun main() {
    println(maxProduct(intArrayOf(-2, 3, -4)))
}