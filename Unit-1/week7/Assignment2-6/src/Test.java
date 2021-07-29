public class Test {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n=a.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int count=0;
                for(int k=0;k<n;k++){
                    for(int l=0;l<n;l++){
                        if(a[i][j]==a[k][l]){
                            count++;
                            if(count>1) {
                                System.out.println("wrong");
                                return;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("correct");
    }
}
