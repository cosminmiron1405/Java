public class DemoPisica{
    public static void main(String[] args){
        
        System.out.println("Nr de pisici: " + Pisica.nrPisici);
        Pisica p1 = new Pisica("Tom", 3);
        
        System.out.println("Nr de pisici: " + Pisica.nrPisici); // apartine clasei, motiv pentru care putem dereferentia variabila nrPisici direct din denumirea clasei
        Pisica p2 = new Pisica("Leo", 5);
        
        System.out.println("Nr de pisici: " + Pisica.nrPisici);
        Pisica p3 = new Pisica("Kitty", 7);
        
        System.out.println("Nr de pisici: " + Pisica.nrPisici);
        Pisica p4 = p2;
        System.out.println("Nr de pisici: " + Pisica.nrPisici);
        Pisica p5 = p4;
        System.out.println("Nr de pisici: " + Pisica.nrPisici);
    }
}