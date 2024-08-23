public class DemoPisica{
    public static void main(String [] args){
        
        Animal a1 = new Animal();
        a1.areBlana = true;
        a1.varsta = 5;
        a1.tipMancare = "oase";
        
        Pisica p1 = new Pisica();
        p1.nume = "tom";
        p1.greutate = 7;
        p1.areBlana = true;
        p1.varsta = 2;
        p1.tipMancare = "pernute";
        
        a1.mananca();
        //a1.seJoaca();
        p1.mananca();
        p1.seJoaca();
        
    }
}