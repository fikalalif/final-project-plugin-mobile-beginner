package Class

fun main() {
    val tinggiSegitiga = 8
    for (i in 1..tinggiSegitiga) {
        for (j in 1..tinggiSegitiga - i) {
            print(" ")
        }
        for (k in 1..<2 * i) {
            print("*")
        }
        println()
    }
}
