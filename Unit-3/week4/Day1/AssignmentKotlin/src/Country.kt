import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val countries = ArrayList<String>()
    for (i in 0..9) {
        countries.add(scanner.next())
    }
    println("Enter the Search country")
    val searchCountry = scanner.next()
    var isPresent = false
    for (i in countries.indices) {
        if (searchCountry == countries[i]) {
            isPresent = true
            break
        }
    }
    if (isPresent) {
        println("Country found")
    } else {
        println("Country not found")
    }
}
