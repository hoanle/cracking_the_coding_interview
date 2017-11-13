fun main(args: Array<String>) {
    println("isRotation " + isRotation("erbottlewat", "waterbottle"))
}

fun isRotation(original: String, sampleToCheck: String): Boolean {
    if (original.length != sampleToCheck.length) {
        return false
    } else {
        val combinedStr = original + original
        return isSubString(combinedStr, sampleToCheck)
    }
}

fun isSubString(original: String, sampleToCheck: String): Boolean {
   return original.indexOf(sampleToCheck) >= 0;
}
