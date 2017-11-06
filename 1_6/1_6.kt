fun main(args: Array<String>) {
    println("compress " + compress("aaaaabbbbbccd"))
}

fun compress(original: String): String {
    var count = 0
    var buildString= StringBuilder()

    for (i in 0..original.length-1) {
      	count = count + 1
       if (i+1 == original.length || original[i] != original[i+1] ) {
        	buildString.append(original[i])
       		buildString.append(count.toString())
           count = 0
       }
    }
    var compiledString = buildString.toString()
    return if (compiledString.length > original.length) original else compiledString;
}
