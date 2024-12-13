import kotlin.math.max
import kotlin.math.min
//https://leetcode.com/problems/container-with-most-water/description/
fun maxArea(height: IntArray): Int {
    var i = 0
    var j = height.size - 1
    var maxx = 0
    while (i < j) {
        val num = min(height[i], height[j]) * (j - i)
        maxx = max(num, maxx)
        if (height[i] > height[j]) j--
        else i++
    }
    return maxx
}


fun main() {
    println(maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
}