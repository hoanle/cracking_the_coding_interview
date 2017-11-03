fun main(args: Array<String>){
    println("is " + isPermutation("abcde12345", "12345abcde"))
}

fun isPermutation(original: String, sampleToCheck: String): Boolean {
    if (original.length != sampleToCheck.length) {
        return false
    } else {
        val charArrayCount = IntArray(128)

        for (item in original) {
            charArrayCount[item.toInt()] = charArrayCount[item.toInt()] + 1
        }

        for (item in sampleToCheck) {
            if (charArrayCount[item.toInt()] == 0) {
                return false
            }
            charArrayCount[item.toInt()] = charArrayCount[item.toInt()] - 1
        }
        return true
    }
}
