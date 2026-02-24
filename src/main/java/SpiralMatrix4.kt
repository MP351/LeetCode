import ds.ListNode

class SpiralMatrix4 {
    fun spiralMatrix(m: Int, n: Int, head: ListNode?): Array<IntArray> {
        val matrix = Array(m) {
            IntArray(n) { -1 }
        }

        var cursor = head

        var borderStart = 0
        var borderEnd = n-1
        var borderTop = 0
        var borderBottom = m-1

        while (cursor != null) {
            for (j in borderStart .. borderEnd) {
                matrix[borderTop][j] = cursor?.`val` ?: -1
                cursor = cursor?.next
            }
            if (cursor == null) {
                break
            }
            borderTop++
            for (j in borderTop .. borderBottom) {
                matrix[j][borderEnd] = cursor?.`val` ?: -1
                cursor = cursor?.next
            }
            borderEnd--
            if (cursor == null) {
                break
            }
            for (j in borderEnd downTo  borderStart) {
                matrix[borderBottom][j] = cursor?.`val` ?: -1
                cursor = cursor?.next
            }
            borderBottom--
            if (cursor == null) {
                break
            }
            for (j in borderBottom downTo  borderTop) {
                matrix[j][borderStart] = cursor?.`val` ?: -1
                cursor = cursor?.next
            }
            borderStart++
            if (cursor == null) {
                break
            }
        }

        for (i in matrix.indices) {
            for (j in matrix[i].indices) {
                print("${matrix[i][j]} ")
            }
            println()
        }
        return matrix
    }
}