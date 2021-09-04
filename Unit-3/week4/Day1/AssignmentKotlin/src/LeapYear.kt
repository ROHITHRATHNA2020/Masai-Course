import java.util.*

fun main(){
     var scanner = Scanner(System.`in`)
    var year = scanner.nextInt()
    if(year%4==0){
        print("Leap Year")
    }else{
        print("Not a Leap Year")
    }
}