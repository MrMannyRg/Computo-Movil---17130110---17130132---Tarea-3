fun isValidIdentifier(s: String): Boolean {
    var flag = false
    for (i in s) {
        if (i.isLetter() || i.equals('_'))
            flag = true
        else
            if (!i.isLetterOrDigit())
                flag = false
    }
    return flag

}
fun main(args: Array<String>) {
    println("Problema 1: ")
    println(isValidIdentifier("name")) // true
    println(isValidIdentifier("_name")) // true
    println(isValidIdentifier("_12")) // true
    println(isValidIdentifier("")) // false
    println(isValidIdentifier("012")) // false
    println(isValidIdentifier("no$")) // false

    println()

    println("Problema 2: ")

    println(listOf('a', 'b', 'c').joinToString(
    separator = "", prefix = "(", postfix = ")"))
}
