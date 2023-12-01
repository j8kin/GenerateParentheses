class Solution {
    private val cache = HashMap<Int,List<String>>()

    private fun getList(n: Int): List<String> {
        if (!cache.containsKey(n)) {
            if (n == 1) cache[1] = listOf("()")
            else generateParenthesis(n)
        }
        return cache[n]!!
    }

    private fun merge2ListsCache (list1: List<String>, list2: List<String>, n: Int) {
        val cacheList = mutableListOf<String>()
        if (cache.containsKey(n)) cacheList.addAll(cache[n]!!)
        for (el1 in list1) {
            for (el2 in list2) {
                if (!cacheList.contains("$el1$el2")) cacheList.add("$el1$el2")
                if (!cacheList.contains("$el2$el1")) cacheList.add("$el2$el1")
                if (el1.length == 2) cacheList.add("($el2)")
            }
        }
        cache[n] = cacheList
    }

    fun generateParenthesis(n: Int): List<String> {
        if ( n== 0) return emptyList()
        if (n > 1) {
            var i=1
            while (i <= n / 2) {
                val add1 = getList(i)
                val add2 = getList(n-i)

                merge2ListsCache(add1, add2, n)
                i++
            }
        }

        return getList(n)
    }
}