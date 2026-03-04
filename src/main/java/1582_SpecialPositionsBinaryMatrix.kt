class SpecialPositionsBinaryMatrix {
    fun numSpecial(mat: Array<IntArray>): Int {
        var counter = 0

        for (i in mat.indices) {
            for (j in mat[i].indices) {
                counter += isSpecial(mat, i, j)
            }
        }

        return counter
    }

    private fun isSpecial(mat: Array<IntArray>, i: Int, j: Int): Int {
        if (mat[i][j] != 1) {
            return 0
        }

        for (jj in mat[i].indices) {
            if (mat[i][jj] > 0) {
                if (jj == j) {
                    continue
                }
                return 0
            }
        }

        for (ii in mat.indices) {
            if (mat[ii][j] > 0) {
                if (ii == i) {
                    continue
                }
                return 0
            }
        }

        return 1
    }
}