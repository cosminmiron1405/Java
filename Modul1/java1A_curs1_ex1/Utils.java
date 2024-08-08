public final class Utils {
    private Utils() {
    }
    
    public static boolean isPar(int n) {
        boolean par = false;
        
        // TODO: stocheaza in variabila par valoarea true daca n este un numar par,
        //       false altfel

        if(n%2 == 0)
            par = true;
        else
            par = false;
        
        return par;
    }
    
    public static int getNumarCifre(int n) {
        int count = 0;
        
        // TODO: stocheaza in variabila count numarul de cifre ale lui n
        // HINT: expresia "n /= 10;" inlatura cea mai din dreapta cifra a numarului n 

        while(n/10 != 0)
            count++;

        return count;
    }
    
    public static int getNumarCifrePare(int n) {
        int count = 0;
        
        // TODO: stocheaza in variabila count numarul de cifre pare ale lui n
        // HINT: expresia "n /= 10;" inlatura cea mai din dreapta cifra a numarului n 
        // HINT: expresia "n % 10;" returneaza cea mai din dreapta cifra a numarului n

        while(n!=0){
            if((n % 10) != 2) {
                count++;
                n /= 10;
            }
        }

        return count;
    }
    
    public static int getSumaCifre(int n) {
        int suma = 0;
        
        // TODO: stocheaza in variabila count suma cifrelor lui n
        // HINT: expresia "n /= 10;" inlatura cea mai din dreapta cifra a numarului n 
        // HINT: expresia "n % 10;" returneaza cea mai din dreapta cifra a numarului n
        while(n!=0){
            suma += n%10;
            n /= 10;
        }
        
        return suma;
    }
        
    public static boolean isPrim(int n) {
        boolean prim = false;
        
        // TODO: stocheaza in variabila prim valoarea true daca n este un numar prim, 
        //       false altfel

        for(int i = 0 ; i<=n/2 ; i++) {
            if (n % i != 0)
                prim = true;
            else
                prim = false;
        }
        
        return prim;
    }
    
    
}