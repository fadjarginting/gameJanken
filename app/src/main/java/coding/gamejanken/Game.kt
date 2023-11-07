package coding.gamejanken

import kotlin.random.Random

object Game {
    private val rules = mapOf(
        "ROCK-SCISSORS" to true,
        "ROCK-PAPER" to false,
        "SCISSORS-PAPER" to true,
        "SCISSORS-ROCK" to false,
        "PAPER-ROCK" to true,
        "PAPER-SCISSOR" to false,
    )
    private val options = listOf("ROCK","SCISSOR", "PAPER")

    private val optionDrawable = mapOf(
        "ROCK" to R.drawable.rock,
        "SCISSORS" to R.drawable.scissors,
        "PAPER" to R.drawable.paper,
    )

    fun pickRandomOption():String = options[Random.nextInt(0,3)]
    fun pickDrawable(option: String): Int {
        return optionDrawable[option] ?: 0 // Mengembalikan nilai default jika tidak ditemukan.
    }
    fun isDraw(from:String, to:String):Boolean = from == to
    fun isWin(from: String, to: String): Boolean {
        val key = "$from-$to"
        return rules[key] ?: false // Mengembalikan false jika aturan tidak ditemukan.
    }

}