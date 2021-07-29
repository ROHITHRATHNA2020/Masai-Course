import com.sun.source.tree.TypeCastTree;

import java.util.Arrays;

public class alphabeticalOrder {
    public static void main(String[] args) {
        String str = "rohith";
        char[] arr=str.toCharArray();
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]>arr[j]){
                    char temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(new String(arr));
    }
}

