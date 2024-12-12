fun missingNumber(nums: IntArray): Int {
    var xor = 0
    for (i in nums){
        xor = xor xor i
    }
    for (i in 0..nums.size){
            xor = xor xor i
    }
    return xor
}

fun main() {
    println(missingNumber(intArrayOf(9,6,4,2,3,5,7,0,1)))
}