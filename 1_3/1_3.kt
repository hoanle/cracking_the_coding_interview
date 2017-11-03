/**
 * Line 13 demonstrates string templates and array access.
 * See this pages for details:
 * http://kotlinlang.org/docs/reference/basic-types.html#strings
 * http://kotlinlang.org/docs/reference/basic-types.html#arrays
 */
fun main(args: Array<String>){
    println(replaceSpace("123 ABC"))
}

fun replaceSpace(original: String): String {
    val lastPosition = findLastPosition(original)
    val spaceCount = countSpaces(original, lastPosition)
    return makeNewArray(original, spaceCount, lastPosition)
}

fun findLastPosition(original: String): Int {
    for (i in original.length-1 downTo 0) {
        if (original[i] != ' ') {
            return i
        }
    }
    return 0
}

fun countSpaces(original: String, lastPosition: Int): Int {
    var count = 0
    for (i in 0..lastPosition) {
        if (original[i] == ' ') {
            count += 1
        }
    }
    return count
}

fun makeNewArray(original: String, spaceCount: Int, lastPosition: Int): String {
    val charArray = CharArray(lastPosition + 1 + spaceCount*2)
    var j = 0
    for (i in 0..lastPosition) {
    	if (original[i] == ' ') {
            charArray[j] = '%'
            charArray[j+1] = '2'
            charArray[j+2] = '0'
            j = j + 3
        } else {
            charArray[j] = original[i]
            j++
        }
    }
    return String(charArray);
}
