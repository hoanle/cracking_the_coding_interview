fun main(args: Array<String>) {
    println("isPermutation " + isOneWay("taco", "tacos"))
    println("isPermutation " + isOneWay("taco", "tac"))
    println("isPermutation " + isOneWay("taco", "taCo"))

    println("isPermutation " + isOneWay("taco", "tacoss"))
    println("isPermutation " + isOneWay("taco", "ta"))
    println("isPermutation " + isOneWay("taco", "tACo"))
}

fun isOneWay(original: String, sampleToCheck: String): Boolean {
    if (original.length == sampleToCheck.length) {
        return isOneReplace(original, sampleToCheck);
    } else if (original.length == sampleToCheck.length + 1) {
        return isOneInsert(sampleToCheck, original)
    } else if (original.length == sampleToCheck.length - 1) {
        return isOneInsert(original, sampleToCheck)
    } else {
        return false;
    }
}

fun isOneReplace(original: String, sampleToCheck: String) : Boolean {
    var foundDifference = false
    for (i in 0..original.length-1) {
    	if (original[i] != sampleToCheck[i]) {
        	if (foundDifference) {
            	return false
        	}
            foundDifference = true
        }
    }
    return true
}


fun isOneInsert(shorter: String, longer: String): Boolean {
	 var indexOfLonger = 0
   var indexOfShorter = 0
   while (indexOfShorter < shorter.length && indexOfLonger < longer.length) {
        if (shorter[indexOfShorter] != longer[indexOfLonger]) {
            if (indexOfShorter != indexOfLonger) {
                return false
            }
         	indexOfLonger = indexOfLonger + 1
         } else {
            indexOfLonger = indexOfLonger + 1
            indexOfShorter = indexOfShorter + 1
         }
    }
    return true
}
