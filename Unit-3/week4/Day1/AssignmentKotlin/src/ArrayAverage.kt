import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = intArrayOf()
    println(avg(a))
}

private fun avg(a: IntArray): Double {
    val n = a.size
    if (n == 0)
        return 0.0
    var sum = 0
    for (i in 0 until n) {
        sum += a[i]
    }
    return (sum / n).toDouble()
}