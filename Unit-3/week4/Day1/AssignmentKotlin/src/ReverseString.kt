import java.util.*

fun main(){
    val sc = Scanner(System.`in`);
    val str = sc.next();
    for (i in 0 until str.length) {
        print(str[str.length - i - 1])
    }

}