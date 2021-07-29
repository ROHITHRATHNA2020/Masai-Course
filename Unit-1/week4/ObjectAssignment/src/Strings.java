public class Strings {
    public static void main(String[] args) {
        String name="";
        int n=name.length();
//        String reverse="";
//        for(int i=n-1;i>=0;i--){
//            reverse= reverse + name.charAt(i);
//        }
//        if(reverse.equals(name)){
//            System.out.println("Palidrome");
//        }else{
//            System.out.println("not");
//        }
        boolean isPalindrome=true;
        int i=0;
        while(i<n)
            if(name.charAt(i)==name.charAt(n-1)){
                i++;
                n--;
            }else{
               isPalindrome=false;
               break;
        }
        if(isPalindrome==true && name.length()>0){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not");
        }
    }
}
