package Class

class segitigaPiramid {
    companion object{
        fun Piramid() {
            val tinggiSegitiga = 8
            for (i in 1..tinggiSegitiga) {
                for (j in 1..tinggiSegitiga- i) {
                    print(" ")
                }
                for (k in 1 ..< 2 * i) {
                    print("*")
                }
                println()
            }
        }
    }
}