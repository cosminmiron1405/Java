public class Exemplu1{
    public static void main(String[] args){
        Pisica p1 = new Pisica();
        p1.varsta = 10;
        
        System.out.println(p1.varsta);
        
        p1.transferPrinValoare(p1.varsta);
        System.out.println(p1.varsta);
        //in urma transferului parametrului ca si valoare, modificarea nu 
        //se pastreaza la nivel global, valoarea atributului fiind in continuare 
        // 10, fiind transmisa doar o copie
        
        p1.transferPrinReferinta(p1);
        System.out.println(p1.varsta);
        //in urma transferului parametrului ca si referinta, 
        //modificarea se pastreaza la nivelul intregului program,
        // atributul "varsta" ramand alterat, nu se transmite o
        //copie ci se transmite direct referinta din memorie
        
    }
}