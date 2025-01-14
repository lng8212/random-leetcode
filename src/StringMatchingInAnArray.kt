//https://leetcode.com/problems/string-matching-in-an-array/description/

fun stringMatching(words: Array<String>): List<String> {
    val result = mutableListOf<String>()
    for(i in words.indices){
       for(j in words.indices){
           if(i!=j){
               if(words[j].contains(words[i])) {
                   result.add(words[i])
                   break
               }
           }
       }
    }
    return result
}


fun main() {
    println(stringMatching(arrayOf("blue","green","bu")).joinToString())
}