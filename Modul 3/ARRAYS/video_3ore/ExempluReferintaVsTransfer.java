public class ExempluReferintaVsTransfer{
    public static void main(String[] args){
        Foo f1 = new Foo();
        int x = 30;
        
        Punct p1 = new Punct(15, 20);
        
        System.out.println("Valoare initiala transmisa prin valoare " + x);
        f1.transferPrinValoare(x);
        System.out.println(x);
        
        System.out.println("Valoarea initiala transmisa print referinta" + p1.x);
        f1.transferPrinReferinta(p1);
        System.out.println(p1.x);
    }
}