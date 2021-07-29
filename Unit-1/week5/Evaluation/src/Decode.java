public class Decode {
    public static void main(String[] args) {
        String str="AAA";
        int n=str.length();
        int max=1;
        for(int i=0;i<n-1;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }else{
                    i=j-1;
                    break;
                }
                if(max<count){
                    max=count;
                }
            }
        }
        System.out.println(max);
    }
}
