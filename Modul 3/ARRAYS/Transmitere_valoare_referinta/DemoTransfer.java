public class DemoTransfer{
    public static void main(String[] args){
        Incrementare i = new Incrementare();
        int x = 3;
        System.out.println("Valoarea lui x inainte de apelul metodei transferPrinValoare este: " + x);
        i.transferPrinValoare(x);
        System.out.println("Valoarea lui x dupa apelul metodei transferPrinValoare este: " + x);
        
        Numar nr = new Numar(3);
        
        System.out.println("Valoarea lui nr inainte de apelul metodei transferPrinReferinta este: " + nr.valoare);
        i.transferPrinReferinta(nr);
        System.out.println("Valoarea lui nr dupa apelul metodei transferPrinReferinta este: " + nr.valoare);
        
    }
}