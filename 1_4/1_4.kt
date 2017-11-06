fun main(args: Array<String>) {
    println("isPermutation " + isPermutation("taco cat", "atco cta"))
    println("isPermutation " + isPermutation("taco cat", "taco eat"))
    println("isPermutation " + isPermutation("taco cat", "taco   eat"))
}

fun isPermutation(original: String, sampleToCheck: String): Boolean {
  if (original.length != sampleToCheck.length) {
    return false
  } else {
    var intArray = IntArray(128)
    for (i in 0..original.length-1) {
      var c = original[i].toInt()
      intArray[c] = intArray[c] + 1
    }

    for (i in 0..sampleToCheck.length-1) {
      var c = sampleToCheck[i].toInt()
      if (intArray[c] == 0) {
        return false
      } else {
        intArray[c] = intArray[c] - 1
      }
    }
      return true
  }
}
