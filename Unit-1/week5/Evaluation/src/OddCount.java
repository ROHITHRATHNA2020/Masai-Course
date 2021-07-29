public class OddCount {
    public static void main(String[] args) {
        int[]a={3,7,1,1,1,1,2,2,2,2,2,2,2,1,1,1,1,1};
        int n=a.length;
        int count;
        int max=0;
        for(int i=0;i<n-1;i++){
            if(a[i]%2==1){
                 count=1;
                for(int j=i+1;j<n;j++) {
                    if (a[j] % 2 == 1) {
                        count++;
                    } else {
                        i = j + 1;
                        break;
                    }
                }
                if(max<count){
                    max=count;
                }
            }
        }
        System.out.println(max);
    }
}
