import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val hashMap = HashMap<Char, Int>()
    val str1 = scanner.nextLine()
    val str = str1.replace(" ".toRegex(), "")
    for (i in 0 until str.length) {
        if (hashMap.containsKey(str[i])) {
            var count = hashMap[str[i]]!!
            hashMap[str[i]] = ++count
        } else {
            hashMap[str[i]] = 1
        }
    }
    for ((key, value) in hashMap) {
        println("$key-$value")
    }
}