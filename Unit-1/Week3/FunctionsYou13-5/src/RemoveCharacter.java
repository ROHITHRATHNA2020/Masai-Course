import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String name= scanner.next();
        char ch=scanner.next().charAt(0);
        removeCharacter(name,ch);
    }

    public static void removeCharacter(String name,char ch){
        String output="";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)!=ch){
                output=output+name.charAt(i);
            }
        }
        System.out.println(output);
    }
}
