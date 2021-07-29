public class Mirror {
    public static void main(String[] args) {
        String str="abzy";  //zyab
//        char ch='a';
//        for(int i=0;i<name.length();i++){
//            if(name.charAt(i)<=109){
//                ch=(char)(name.charAt(i)+25-((name.charAt(i)-97)*2));
//            }else{
//                ch=(char)(name.charAt(i)-25+((122-name.charAt(i))*2));
//            }
//            System.out.print(ch);
//        }
        String output="";
        String reverseAlphabet="zyxwvutsrqponmlkjihgfedcba";
        for(int i=0;i<str.length();i++){
         output=output+ reverseAlphabet.charAt(str.charAt(i)-'a');
        }
        System.out.println(output);
    }
}
