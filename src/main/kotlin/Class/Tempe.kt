package Class

class Tempe {

    companion object {
        fun S(a: Int) {
            for (i in 1..a) {
                for (j in 1..a - i) {
                    print(" ")
                }
                for (k in 1..<2 * i) {
                    print("*")
                }
                println()
            }
            for (i in a downTo 1) {
                for (j in 1..<a - i + 1) {
                    print(" ")
                }
                for (k in 1..<2 * i) {
                    print("*")
                }
                println()
            }
        }


    }

}