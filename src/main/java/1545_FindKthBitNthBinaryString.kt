class FindKthBitNthBinaryString {
    fun findKthBit(n: Int, k: Int): Char {
        println(k.takeHighestOneBit())

        val sb = StringBuilder("0")

        for (i in 0 until n) {
            sb.append("1${invert(sb).reversed()}")
        }

        return sb[k-1]
    }

    private fun invert(sb: StringBuilder): StringBuilder {
        val rt = StringBuilder()

        sb.forEach {
            rt.append((it.code and 1) xor 1)
        }

        return  rt
    }
}