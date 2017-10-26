fun main(args: Array<String>) {
    println(doesStringHaveOnlyUniqueCharacters("123 45"))
    println(doesStringHaveOnlyUniqueCharacters("12345  5a   a"))
}

fun doesStringHaveOnlyUniqueCharacters(str: String): Boolean {
    if (str.length > 128) return false
    var array: BooleanArray = BooleanArray(128)
    for (i in str) {
        if (array[i.toInt()]) {
            return false
        }
        array[i.toInt()] = true
    }
    return true;
}
