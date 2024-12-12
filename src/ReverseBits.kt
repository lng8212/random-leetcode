fun reverseBits(n: Int): Int {
    var origin = n
    var reserve = 0
    for (i in 1 ..32){
        reserve = reserve shl 1
        reserve = reserve or (1 and origin)
        origin = origin shr 1
    }
    return reserve
}


fun main() {
    print(reverseBits(43261596))
}