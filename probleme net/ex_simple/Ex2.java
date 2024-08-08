import java.util.Scanner;
public class Ex2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Nr 1:" );
        int nr1 = in.nextInt();
        System.out.println("Nr 2:" );
        int nr2 = in.nextInt();
        
        int sum = nr1 + nr2;
        System.out.println(nr1 + " + " + nr2 + " = " + sum);
        int sub = nr1 - nr2;
        System.out.println(nr1 + " - " + nr2 + " = " + sub);
        int mult = nr1 * nr2;
        System.out.println(nr1 + " * " + nr2 + " = " + mult);
        float div = nr1 / nr2;
        System.out.println(nr1 + " / " + nr2 + " = " + div);
        int mod = nr1 % nr2;
        System.out.println(nr1 + " mod " + nr2 + " = " + mod);
        
    }
}