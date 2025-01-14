//https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/

fun countPrefixSuffixPairs(words: Array<String>): Int {
    var ans = 0
    for (i in words.indices) {
        for (j in i + 1..<words.size) {
            val firstString = words[i]
            val secondString = words[j]
            if (firstString.length <= secondString.length) {
                if (isPrefixAndSuffix(firstString, secondString)) ans++
            }
        }
    }
    return ans
}

fun isPrefixAndSuffix(child: String, parent: String): Boolean {
    var isValid = true
    for (i in child.indices) {
        if (parent[i] == parent[parent.length  - child.length + i] && parent[i] == child[i]) {
            continue
        } else {
            isValid = false
            break
        }
    }
    return isValid
}

fun main() {
    println(countPrefixSuffixPairs(arrayOf("bb","bb")))
}