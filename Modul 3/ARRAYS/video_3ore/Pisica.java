public class Pisica{
    String nume;
    String culoare;
    int varsta;
    
    //this = in constructor este instata care se construieste
    //this = in general, este instanta clasei curente
    Pisica(String nume, String culoare, int varsta){
        this.nume = nume;
        this.culoare = culoare;
        this.varsta = varsta;
    }
    
    void spuneMiau(){
        System.out.println("Miau" + this.nume);
    }
}