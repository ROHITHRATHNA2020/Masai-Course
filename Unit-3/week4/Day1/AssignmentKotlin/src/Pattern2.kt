import java.util.*

fun main(){
    val scanner = Scanner(System.`in`);
    val left = scanner.nextInt();
    val right = scanner.nextInt();
    for(i in 1..left){
        for(j in 1..right){
            println("$i.$j")
        }
    }
}