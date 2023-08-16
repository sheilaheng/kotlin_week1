fun main(args: Array<String>) {
    println("Enter an Alphabet:")
    val letter = readLine()!!.toString().trim()
    if (letter.isBlank()) {
        println("Empty submission try again")
    } else {

        var chara = letter!!.toCharArray()[0]
        var result = if (chara in "aeiou") {
            println("$chara is a vowel")

        } else{
            println("$chara is a consonant")
        }
    }
}