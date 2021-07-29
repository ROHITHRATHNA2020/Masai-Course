public class Nested {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++){
                if((i==2 && i==5)) {
                    continue;
                }
                System.out.println(i + "." + j);
            }

        }
    }
}
