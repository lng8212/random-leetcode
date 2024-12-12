fun hammingWeight(n: Int): Int {
    var divided = n
    var result = 0
    while (divided > 0) {
        if (divided % 2 == 1) result += 1
        divided /= 2
    }
    return result
}


fun main() {
    print(hammingWeight(2147483645))
}