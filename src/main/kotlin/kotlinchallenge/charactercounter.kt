
fun characteroccurences(userinput:String, chartag:Char):Int{
    var charCount = 0
    for (a in userinput){
        if(a == chartag){
            charCount  += 1
        }
    }

    return charCount

}

fun main(args: Array<String>) {
    println("Enter Any Word Or Sentence")
    var datainput = readLine() ?:""
    println("Enter Any Letter to check for Occurences")
    var mytargetChar = readLine()?.get(0)?: ' '

    var Charoccurence = characteroccurences(datainput,mytargetChar)
    println("$mytargetChar appears $Charoccurence number of times")



}
