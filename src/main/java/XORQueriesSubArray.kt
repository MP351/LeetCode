import kotlin.math.abs

class XORQueriesSubArray {
    fun xorQueries(arr: IntArray, queries: Array<IntArray>): IntArray {
        val result = IntArray(queries.size)
        for (i in queries.indices) {
            for (j in queries[i][0].. queries[i][1]) {
                result[i] = result[i] xor arr[j]
            }
        }
        return result
    }
}