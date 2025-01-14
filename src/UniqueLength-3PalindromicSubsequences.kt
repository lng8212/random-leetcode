//https://leetcode.com/problems/unique-length-3-palindromic-subsequences/description/?envType=daily-question&envId=2025-01-04


fun countPalindromicSubsequence(s: String): Int {
    var result = 0
    val firstIdx = IntArray(26){-1}
    val lastIdx = IntArray(26){1}
    for( i in s.indices){
        val value = s[i] - 'a'
        if(firstIdx[value] == -1) firstIdx[value] = i
        lastIdx[value] = i
    }
    for(i in 0 .. 25){
        if(firstIdx[i] == -1 || lastIdx[i] - firstIdx[i] <2) continue
        val checkArray = BooleanArray(26){false}
        for (j in firstIdx[i]+1 until lastIdx[i]){
            if(!checkArray[s[j]-'a']){
                result +=1
                checkArray[s[j]-'a'] = true
            }
        }
    }
    return result
}

fun main() {
    println(countPalindromicSubsequence("aabca"))
}
