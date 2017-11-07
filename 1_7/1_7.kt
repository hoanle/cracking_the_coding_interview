fun main(args: Array<String>) {
    var twoDArray = arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12), intArrayOf(13, 14, 15, 16))
    rorateMatrix(twoDArray)

}

fun rorateMatrix(twoDArray: Array<IntArray>) {
	var height = twoDArray.size
    var width = twoDArray[0].size
    findTranspose(twoDArray, height, width)
    reverse(twoDArray, height, width)

    for (row in 0..height-1) {
        for (column in 0..width-1) {
            print("${twoDArray[row][column]} ")
        }
        println("")
    }
}

fun findTranspose(twoDArray: Array<IntArray>, height: Int, width: Int) {
   for (row in 0..height-1) {
        for (column in row..width-1) {
            val (a, b) = swap(twoDArray[row][column], twoDArray[column][row])
            twoDArray[row][column] = a
            twoDArray[column][row] = b
        }
    }
}

fun reverse(twoDArray: Array<IntArray>, height: Int, width: Int) {
    for (column in 0..width-1) {
       for (row in 0..(height/2-1/2)) {
           val (a , b) = swap(twoDArray[row][column], twoDArray[height-row-1][column])
           twoDArray[row][column] = a
           twoDArray[height-row-1][column] = b

       }
   }
}

fun swap(a: Int, b: Int): Pair<Int, Int> {
    return Pair(b, a)
}
