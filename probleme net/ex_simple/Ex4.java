import java.util.Scanner;
public class Ex4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Nr1 = ");
        int n1 = in.nextInt();
        System.out.println("Nr2 = ");
        int n2 = in.nextInt();
        System.out.println("Nr3 = ");
        int n3 = in.nextInt();
        
        System.out.println((n1 + n2 + n3) / 3);
    }
}