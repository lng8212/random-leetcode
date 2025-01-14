//https://leetcode.com/problems/minimum-length-of-string-after-operations/description/

fun minimumLength(s: String): Int {
    val mp = IntArray(26) { 0 }
    for (item in s) {
        mp[item - 'a']++
    }
    for (i in mp.indices) {
        if (mp[i] > 2) {
            if (mp[i] % 2 != 0) mp[i] = 1
            else mp[i] = 2
        }
    }
    return mp.sum()
}

fun main() {
    println(minimumLength("aa"))
}