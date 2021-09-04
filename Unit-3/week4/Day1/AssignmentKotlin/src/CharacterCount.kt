import java.util.*

fun main(){
    var scanner = Scanner(System.`in`)
    var a = arrayOf("HTML", "CSS", "JAVA", "JS", "ANDROID")
    var count = 0
    for(i in a.indices){
        for(j in 0 until a[i].length) {
            count++
        }
    }
    print(count)
}
