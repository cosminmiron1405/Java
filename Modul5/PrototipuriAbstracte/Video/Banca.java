package Video;

public abstract class Banca{
    String nume;
    
    public Banca(String nume){
        this.nume = nume;
    }
    
    public void afiseazaNume(){
        System.out.println(this.nume);
    }
    
    public abstract double calculeazaDobanda();
}