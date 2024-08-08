import java.util.Scanner;

public class Ex3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Insert the number");
        int n = in.nextInt();
        
        for(int i = 1 ; i<=10 ; i++){
            int prod = n * i;
            System.out.println(n + " * " + i + " = " + prod);
        }
    }
}