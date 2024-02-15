package Class

class polaX{
    companion object{
        fun x() {
            val rows = 5

            for (i in 0 until rows) {
                for (j in 0 until rows) {
                    if (i == j || i + j == rows - 1) {
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

