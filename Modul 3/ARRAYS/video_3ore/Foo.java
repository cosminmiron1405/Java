public class Foo{
    void transferPrinValoare(int x){
        x = 10;
        System.out.println("valoarea lui x in metoda " + x);
    }
    void transferPrinReferinta(Punct p){
        p.x = 10;
        System.out.println("p.x in metoda are valoarea: " + p.x);
    }
    }
