fun main(args: Array<String>) {
    var matrix = arrayOf(intArrayOf(1, 2, 0, 4), intArrayOf(5, 6, 7, 0), intArrayOf(9, 10, 11, 12), intArrayOf(13, 14, 15, 16))
    val width = matrix[0].size
   	val height = matrix.size
    nullifyMatrix(matrix)
    for (row in 0..height-1) {
        for (column in 0..width-1) {
            print("${matrix[row][column]} ")
        }
        println("")
    }
}

data class MatrixMember(val row: Int, val column: Int)

fun nullifyMatrix(matrix: Array<IntArray>) {
   val zeros: ArrayList<MatrixMember> = checkZero(matrix)
   val width = matrix[0].size
   val height = matrix.size
   for (i in 0..zeros.size-1) {
       val member = zeros.get(i)
       for (column in 0..width-1) {
           matrix[member.row][column] = 0
       }
       for (row in 0..height-1) {
           matrix[row][member.column] = 0
       }
   }
}

fun checkZero(matrix: Array<IntArray>): ArrayList<MatrixMember> {
    val zeros = arrayListOf<MatrixMember>()
    val width = matrix[0].size
   	val height = matrix.size
    for (row in 0..height-1) {
        for (column in 0..width-1) {
            if (matrix[row][column] == 0) {
                zeros.add(MatrixMember(row, column))
            }
        }
    }
    return zeros;
}
