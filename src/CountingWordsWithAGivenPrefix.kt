//https://leetcode.com/problems/counting-words-with-a-given-prefix/description/

fun prefixCount(words: Array<String>, pref: String): Int {
    var ans = 0
    for (item in words){
        if(item.length >= pref.length)
            if(isPrefix(pref, item)) ans++
    }
    return ans
}

fun isPrefix(child: String, parent: String): Boolean {
    var isValid = true
    for (i in child.indices) {
        if (parent[i] == child[i]) {
            continue
        } else {
            isValid = false
            break
        }
    }
    return isValid
}

fun main(){
    println(prefixCount(arrayOf("pay","attention","practice","attend"),"at"))
}