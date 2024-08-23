package Video;

public class ING extends Banca{
    public ING(String nume){
        super("Ing" + nume);
    }
    
    @Override
    public double calculeazaDobanda(){
        return 4.7; //se presupune ca asta e valoarea in urma calc.
    }
    
}