import java.util.Scanner;

public class Main6 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("string");
        String s = in.nextLine();
        System.out.println("int");
        int i = in.nextInt();
        System.out.println("int");
        int n=in.nextInt();
        System.out.println("float");
        float f = in.nextFloat();
        System.out.println("int");
        int k = in.nextInt();

        System.out.printf("string: %s , int: %d , int: %d , int: %d , float: %.3f " ,s,i,n,k,f);

        in.close();
    }
}
