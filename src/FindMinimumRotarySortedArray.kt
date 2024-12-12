
fun findMin(nums: IntArray): Int {
    var ans = nums[0]
    for (i in 1 until nums.size){
        if(ans > nums[i]) ans = nums[i]
    }
    return ans
}

fun main(){

}