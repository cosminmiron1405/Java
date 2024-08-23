package Video;


public class BCR extends Banca{
    
    double reducereStudenti;
    
    public BCR(String nume, double reducereStudenti){
        super("BCR " + nume);
        this.reducereStudenti = reducereStudenti;
    }
    
    @Override
    public double calculeazaDobanda(){
        return 77;
    }
}
