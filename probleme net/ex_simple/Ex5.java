import java.util.Scanner;

public class Ex5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("nr1:");
        int n1 = in.nextInt();
        System.out.println("nr2:");
        int n2 = in.nextInt();
        System.out.println(n1 + " " + n2);
        
        int aux;
        aux = n1;
        n1 = n2;
        n2 = aux;
        
        System.out.println(n1 + " " + n2);
    }
}
