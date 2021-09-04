import java.util.*

fun main(){
    val scanner = Scanner(System.`in`);
    var start = scanner.nextInt();
    val number = scanner.nextInt();
    while(start>0){
        println(start)
        start-=number
    }
}