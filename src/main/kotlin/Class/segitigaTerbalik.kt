package Class

class segitigaTerbalik {
    companion object{
    fun terbalik() {
        val tinggiSegitiga = 8

        for (i in tinggiSegitiga downTo 1) {
            for (j in 1 ..< tinggiSegitiga - i + 1) {
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