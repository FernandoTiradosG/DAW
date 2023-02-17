import java.util.Scanner

fun main() {

    var stone = 1
    var paper = 2
    var sicsor = 3
    var sc = Scanner(System.`in`)

    val total = stone + paper + sicsor
    println("Elige un numero")
    val election = sc.nextInt()
    println(election + total)
}