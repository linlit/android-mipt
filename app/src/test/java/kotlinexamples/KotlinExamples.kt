package kotlinexamples

/*
 * Your task is to implement the sum() function so that it computes the sum of
 * all elements in the given array a.
 */
fun sum(a: IntArray): Int {
    var sumInt = 0
    for (elem in a)
        sumInt += elem
    return sumInt
}

/*
 * Your task is to implement the indexOfMax() function so that it returns
 * the index of the largest element in the array, or null if the array is empty.
 */
fun indexOfMax(a: IntArray): Int? {
    if (a.isEmpty()) return null

    var maxElem: Int = Int.MIN_VALUE
    var maxElemIndex: Int = -1
    var i = 0
    while (i < a.size) {
        val tmpElem = a[i]
        if (tmpElem >= maxElem) {
            maxElem = tmpElem
            maxElemIndex = i
        }
        i++
    }
    return maxElemIndex
}

/*
 * Any array may be viewed as a number of "runs" of equal numbers.
 * For example, the following array has two runs:
 *   1, 1, 1, 2, 2
 * Three 1's in a row form the first run, and two 2's form the second.
 * This array has two runs of length one:
 *   3, 4
 * And this one has five runs:
 *   1, 0, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0
 * Your task is to implement the runs() function so that it returns the number
 * of runs in the given array.
 */
fun runs(a: IntArray): Int {
    if (a.isEmpty()) return 0

    var runsNum = 1
    var i = 0
    while (i < a.size - 1) {
        if (a[i] != a[i + 1]) runsNum++;
        i++
    }
    return runsNum
}

/*
 * Your task is to implement a palindrome test.
 *
 * A string is called a palindrome when it reads the same way left-to-right
 * and right-to-left.
 *
 * See http://en.wikipedia.org/wiki/Palindrome
 */
fun isPalindrome(s: String): Boolean {
    if (s.length < 2) return true

    var i = 0
    while (i < s.length / 2) {
        if (s[i] != s[s.length - 1 - i]) return false
        i++
    }
    return true
}

/*
 * Think of a perfect world where everybody has a soulmate.
 * Now, the real world is imperfect: there is exactly one number in the array
 * that does not have a pair. A pair is an element with the same value.
 * For example in this array:
 *   1, 2, 1, 2
 * every number has a pair, but in this one:
 *   1, 1, 1
 * one of the ones is lonely.
 *
 * Your task is to implement the findPairless() function so that it finds the
 * lonely number and returns it.
 *
 * A hint: there's a solution that looks at each element only once and uses no
 * data structures like collections or trees.
 */
fun findPairless(a: IntArray): Int {
    var lonely = 0;
    for (elem in a)
        lonely = lonely xor elem
    return lonely
}