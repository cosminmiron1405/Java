public class Pisica{
    String nume;
    int varsta;
    static int nrPisici = 0;
    
    /*
     * toate obiectele au acces la atributul static nrPisici, dar
     * acesta apartine clasei, nu obiectului, dupa cum se vede si in 
     * constructor
     */
    
    Pisica(String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
        nrPisici++;
        System.out.println("S-a creat un obiect de tip pisica");
    }
    
    
}