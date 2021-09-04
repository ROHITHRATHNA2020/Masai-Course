import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val arr = ArrayList<String>()
    for (i in 0..9) {
        arr.add(scanner.next())
    }
    println("Enter the Search Country")
    val str = scanner.next()
    for (i in 0..9) {
        if (str == arr[i]) {
            println(str + " " + (i + 1))
        }
    }
}