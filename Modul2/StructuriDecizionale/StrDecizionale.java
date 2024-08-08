public class StrDecizionale{
    public static void main(String[] args){
        int i = 20;
        int j = 30;
        
        if(i==j){
            System.out.println("Numerele sunt egale!");
        }
        else{
            System.out.println("Numerele NU sunt egale");
        }
        if(i<j)
            System.out.println("i este mai mare decat j");
        else{
            System.out.println("i nu este mai mare decat j");
            System.out.println("20<30");
        }
        
        int x = 3;
        
        switch(x){
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("VALOARE INVALIDA");
        }
        
        int Zecimal = 5;
        char Hexa = 
            switch(Zecimal){
                case 0 -> '0';
                case 1 -> '1';
                case 2 -> '2';
                case 3 -> '3';
                case 4 -> '4';
                case 5 -> '5';
                case 6 -> '6';
                case 7 -> '7';
                case 8 -> '8';
                case 9 -> '9';
                case 10 -> 'A';
                case 11 -> 'B';
                case 12 -> 'C';
                case 13 -> 'D';
                default -> '?';
            };
    }
}