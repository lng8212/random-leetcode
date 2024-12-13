//https://leetcode.com/problems/two-sum/description/
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int,Int>()
    for (i in nums.indices) {
        val num1 = nums[i]
        val num2 = target - num1
        if(map.containsKey(num2)){
            return intArrayOf(i, map[num2]?: 0)
        }
        map[num1] = i
    }
    return intArrayOf()
}

fun main() {
    println(twoSum(intArrayOf(3, 2, 4), 6).joinToString())
}
