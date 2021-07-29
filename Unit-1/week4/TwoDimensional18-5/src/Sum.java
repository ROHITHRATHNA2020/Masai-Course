public class Sum {
    public static void main(String[] args) {
        String word1="raam";
        String word2="mrar";
        int sum1=0;
        int sum2=0;
        for(int i=0;i< word1.length();i++){
            sum1=sum1+(char)word1.charAt(i);
        }
        for(int i=0;i< word2.length();i++){
            sum2=sum2+(char)word2.charAt(i);
        }
        if(sum1-sum2==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
