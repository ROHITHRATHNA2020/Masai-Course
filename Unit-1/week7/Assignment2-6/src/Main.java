//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int n=scanner.nextInt();
//        for(int i=1;i<(2*n)+2;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print(j);
//            }
//            for(int k=n;k>n-i-1;k--){
//                if(k==n){
//                    System.out.print("/");
//                }else if(k==n-i){
//                    System.out.print("\\");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            for(int j=n-i+1;j>=1;j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();
        LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
        hashMap.put(1, "Monday");
        hashMap.put(2, "Tuesday");
        hashMap.put(3, "Wednesday");
        hashMap.put(4, "Thursday");
        hashMap.put(5, "Friday");
        hashMap.put(6, "Saturday");
        hashMap.put(7, "Sunday");
        if (n  > 7 ) {
            n = n % 7;
        }
        int a = 0;
        for (Map.Entry<Integer, String> map : hashMap.entrySet()) {
            if (map.getValue().equals(str)) {
                a = map.getKey() + n;
            }
        }
        if (a > 7) {
            a = a % 7;
        }
        System.out.println(hashMap.get(a));

    }
}
