import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val a = intArrayOf(-1, -5, 3, 5, 1, 3, 6)
    for (i in a.indices) {
        var count = 0
        for (j in a.indices) {
            if (a[i] == a[j]) {
                count++
            }
        }
        if (count == 1) {
            print(a[i].toString() + " ")
        }
    }
}

/*
   int[] a = {-1, -5 , 3, 5 , 1 , 3 , 6};
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(a[i]+" ");
            }
        }

        val a = intArrayOf(-1, -5 , 3, 5 , 1 , 3 , 6)
         for(i in 0..a.size-1){
        var count =0;
        for(j in 0..a.size-1){
            if(a[i] == a[j])
                count++
        }
        if(count == 1)
            print("${a[i]} ")
    }
 */