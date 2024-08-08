import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("First number");
        int nr1 = in.nextInt();
        System.out.println("Second number");
        int nr2 = in.nextInt();
        
        System.out.println(nr1 + nr2);
    }
}