//https://leetcode.com/problems/word-break/
fun wordBreak(s: String, wordDict: List<String>): Boolean {
    val dict = wordDict.toHashSet()
    val dp = BooleanArray(s.length + 1)
    dp[0] = true
    for ( i  in 1 .. s.length){
        for (j in 0 until i){
            val subArr = s.substring(j,i)
            if(dp[j] && dict.contains(subArr)){
                dp[i] = true
            }
        }
    }
    return dp[s.length]
}


fun main() {
    println(wordBreak("leetcode", listOf("leet","code")))
}