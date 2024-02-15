package Class

class segitigaKopong{
    companion object{
        fun kopong() {
            val tinggiPiramida = 5

            for (i in 1..tinggiPiramida) {
                for (j in 1..tinggiPiramida - i) {
                    print(" ")
                }
                for (k in 1 ..< 2 * i) {
                    if (k == 1 || k == 2 * i - 1 || i == tinggiPiramida) {
                        print("*")
                    } else {
                        print(" ")
                    }
                }

                println()
            }
        }

    }





}
