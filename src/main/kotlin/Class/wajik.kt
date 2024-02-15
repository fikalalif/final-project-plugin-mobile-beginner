package Class


class wajik () {

    fun segitigaWajik( a : Int)  {

        for (i in 1..a) {
            for (j in 1..a - i) {
                print(" ")
            }
            for (k in 1 ..< 2 * i) {
                print("*")
            }
            println()
        }
        for (i in a downTo 1) {
            for (j in 1 ..< a - i + 1) {
                print(" ")
            }
            for (k in 1 ..< 2 * i) {
                print("*")
            }
            println()
        }
    }

    companion object
}


//fun main() {
//    val tinggiSegitiga = 8
//    for (i in 1..tinggiSegitiga) {
//        for (j in 1..tinggiSegitiga- i) {
//            print(" ")
//        }
//        for (k in 1 ..< 2 * i) {
//            print("*")
//        }
//        println()
//    }
//    for (i in tinggiSegitiga downTo 1) {
//        for (j in 1 ..< tinggiSegitiga - i + 1) {
//            print(" ")
//        }
//        for (k in 1 ..< 2 * i) {
//            print("*")
//        }
//        println()
//    }
//}