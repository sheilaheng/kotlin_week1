package kotlinchallange1

fun main(args: Array<String>) {

    println("Enter word or sentence")
    val word = readLine() ?: ""

    var wordsplit = word.split("")
    var wordreverse = wordsplit.reversed()
    println(wordreverse.joinToString ( " " )
    }

