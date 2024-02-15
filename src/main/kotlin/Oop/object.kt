package Oop

import Class.*

fun main(){
    println("Segitiga Piramid")
    pyramid()
    println()
    println("Segitiga Terbalik")
    flip()
    println()
    println("Wajik")
    wajik()
    println()
    println("Pola X")
    polaXX()
    println()
    println("Segitiga Bolong")
    hollowtriangle()


}

fun wajik(){
    println("${Tempe.S(8)}")
}

fun polaXX(){
    println(" ${polaX.x()}")
}

fun hollowtriangle(){
    println("${segitigaKopong.kopong()}")
}

fun pyramid(){
    println("${segitigaPiramid.Piramid()}")
}

fun flip(){
    println(" ${segitigaTerbalik.terbalik()}")
}









