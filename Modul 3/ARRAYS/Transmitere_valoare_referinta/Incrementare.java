public class Incrementare{
    void transferPrinValoare(int x){
        System.out.println("Valoare lui x la inceputul metodei transferPrinValoare este: " + x);
        x++;
        System.out.println("Valoare lui x la finalul metodei transferPrinValoare este: " + x);
    }
    
    void transferPrinReferinta(Numar nr){
        System.out.println("Valoarea lui nr la inceputul metodei transferPrinReferinta este: " + nr.valoare);
        nr.valoare++;
        System.out.println("Valoarea lui nr la inceputul metodei transferPrinReferinta este: " + nr.valoare);
    }
}