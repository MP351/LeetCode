class SortIntegersByTheNumberOfOneBits {
    fun sortByBits(arr: IntArray): IntArray {
        val result = mutableListOf<IntInfo>()
        arr.forEach {
            result.add(IntInfo(it, getNumOfBits(it)))
        }

        result.sort()

        return result.map { it.num }.toIntArray()
    }


    fun getNumOfBits(num: Int): Int {
        var int = num
        var result = 0

        while (int > 0) {
            result += int and 1
            int = int shr 1
        }
        return  result
    }
}

private data class IntInfo(val num: Int, val bitCount: Int): Comparable<IntInfo> {
    override fun compareTo(other: IntInfo): Int {
        val bitComp = bitCount - other.bitCount
        if (bitComp != 0) {
            return bitComp
        }

        return num - other.num
    }
}

class SortIntegersByTheNumberOfOneBits2 {
    fun sortByBits(arr: IntArray): IntArray {
        for (i in arr.indices) {
            arr[i] = (Integer.bitCount(arr[i]) shl 14) or arr[i]
        }

        arr.sort()

        for (i in arr.indices) {
            arr[i] = arr[i] and 0b11111111111111
        }

        return arr
    }

//    private fun radixSort(arr: IntArray) {
//        var from = arr
//        var to = IntArray(from.size)
//        val counts = IntArray(512)
//        val pos = IntArray(counts.size)
//        val mask = counts.size - 1
//        var shift = 0
//        while (shift <= 9) {
//            for (i in from.indices)
//                counts[(from[i] ushr shift) and mask]++
//            var sum = 0
//            for (i in counts.indices) {
//                pos[i] = sum
//                sum += counts[i]
//            }
//            for (i in from.indices) {
//                val a = (from[i] ushr shift) and mask
//                to[pos[a]++] = from[i]
//                counts[a]--
//            }
//            shift += 9
//            val buf = from
//            from = to
//            to = buf
//        }
//    }
}