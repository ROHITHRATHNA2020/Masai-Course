public class NiceString {
    public static void main(String[] args) {
        String str = "YazaAay";
        int n = str.length();
        int max=0;
        String R="";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String s = "";
                for (int k = i; k <= j; k++) {//s=str.substring(i,j+1);
                    s = s + str.charAt(k);
                }
                boolean niceExist = false;
                for (int t = 0; t < s.length() - 1; t++) {
                    niceExist = false;
                    for (int p = t + 1; p < s.length(); p++) {
                        if ((s.charAt(t) == s.charAt(p) + 32) || (s.charAt(t) == s.charAt(p) - 32)) {
                            niceExist = true;
                        }
                    }
                    if(niceExist==false){
                        break;
                    }
                }
                if (niceExist == true) {
                   if(max<s.length()){
                       max=s.length();
                       R=s;
                   }
                }
            }
        }
        System.out.println(R);
    }
}


//
//
//  to check String is NIce or not
//
//        String s="c";
//        int n=s.length();
//        boolean isNice = false;
//        for(int i=0;i<n-1;i++){
//            isNice=false;
//            for(int j=i+1;j<n;j++){
//                if(s.charAt(i)==s.charAt(j)+32  || s.charAt(i)==s.charAt(j)-32){
//                    isNice=true;
//                }
//            }
//            if(isNice==false){
//                System.out.println("Not a Nice String");
//                break;
//            }
//        }
//        if(isNice==true) {
//            System.out.println("Nice String");
//        }
////    }
//        }
//
