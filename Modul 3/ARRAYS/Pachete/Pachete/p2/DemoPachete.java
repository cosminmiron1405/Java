package p2;

import p1.*;//asa le importa pe toate din p1 ca sa nu mai am 3 randuri pentru importuri
// import p1.B;
// import p1.A; // atunci constructorul A este considerat ca fiind A din p1
// import p1.C;


public class DemoPachete{
    public static void main(String [] args){
    p1.A obiectA = new p1.A();
    p1.B obiectB = new p1.B();
    p1.A obiectA2 = new p1.A(); // tot A din p1
    p2.A obiectA3 = new p2.A(); // acum fac trimitere catre p2 deci ia A din p2
    
    }
}