import java.util.*

fun main(){
    var scanner = Scanner(System.`in`);
    var bill = scanner.nextInt();
    if(bill>=300){
        var discount = bill *0.1;
        if(discount>=100) {
            bill = (bill - 100)
            print("$bill  max dicount is 100 only")
        }else{
            bill = (bill - discount).toInt()
            print("$bill discount done" )
        }
    }else
        print("$bill discount not available")
}

