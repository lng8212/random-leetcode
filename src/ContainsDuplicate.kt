//https://leetcode.com/problems/contains-duplicate/description/
fun containsDuplicate(nums: IntArray): Boolean {
    val hashMap = HashMap<Int, Int>()
    for(item in nums){
        if(hashMap.containsKey(item)){
            return true
        }
        hashMap[item] = 1
    }
    return false
}

fun main() {
    print(containsDuplicate(intArrayOf(1,1,1,3,3,4,3,2,4,2)))
}