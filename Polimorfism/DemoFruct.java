public class DemoFruct{
    public static void main(String [] args){
        Mar m1 = new Mar();
        m1.greutate = 100;
        m1.culoare = "verde";
        
        Mar m2 = new Mar();
        m2.greutate = 150;
        m2.culoare = "rosu";
        
        Para p1 = new Para();
        p1.greutate = 127;
        p1.soi = "A";
        
        Para p2 = new Para();
        p1.greutate = 130;
        p1.soi = "B";
        
        Fruct[] cosCuFructe = new Fruct[4];
        cosCuFructe[0] = m1;
        cosCuFructe[1] = p2;
        cosCuFructe[2] = p1;
        cosCuFructe[3] = m2;
        
        System.out.println(cosCuFructe[2].greutate);
        //System.out.println(cosCuFructe[2].soi); el nu stie ce e in cos prin urmare nu stie ca noi avem acces la acea proprietate care apartine in cazul de fata perei
        Para p3 = (Para) cosCuFructe[2]; //elementul 2 din cosCuFructe se converteste in element de tip Para
        System.out.println(p3.soi);
    }
}