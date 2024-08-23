public class Casa{
    
    //-trebuie sa fie private
    //-trebuie sa scriu un constructor in care sa folosesc atributele
    //-NU se folosesc setteri pentru ca prin ei se pot modifica deci
    //folosesc doar getteri
    
    private final int nrCamere;
    private final int mPatrati;
    private final String adresa;
    
    Casa(int nrCamere, int mPatrati, String adresa){
        this.nrCamere = nrCamere;
        this.mPatrati = mPatrati;
        this.adresa = adresa;
    }
    
    
    public int getNrCamere(){
        return this.nrCamere;
    }
    
    public int getMPatrati(){
        return this.mPatrati;
    }
    
    public String getAdresa(){
        return this.adresa;
    }
    
    
}