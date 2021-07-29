import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Spaces {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int  t=scanner.nextInt();
        while(t-->0){
            int n= scanner.nextInt();
            int k= scanner.nextInt();
            ArrayList<String> arrayList= new ArrayList<>();
            HashSet<String> hashSet= new HashSet<>();
            for(int i=0;i<n;i++){
                String s= scanner.next();
                arrayList.add(s);
            }
            while(k-->0){
                int l= scanner.nextInt();
                for(int i=0;i<l;i++){
                    String x= scanner.next();
                    hashSet.add(x);
                }
            }
            Iterator iterator= hashSet.iterator();
            while(iterator.hasNext()){
                String data= (String)iterator.next();
                System.out.println(data);
            }
            for(int i=0;i<n;i++){
                if(hashSet.contains(arrayList.get(i))){
                    System.out.print("Yes"+" ");
                }else{
                    System.out.print("No"+" ");
                }
            }
        }
    }
}
