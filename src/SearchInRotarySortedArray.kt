import java.util.HashMap


fun search(nums: IntArray, target: Int): Int {
    for (i in nums.indices) {
        if (nums[i] == target) return i
    }
    return -1
}

fun main() {

}