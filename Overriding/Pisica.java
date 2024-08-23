public class Pisica extends Animal{
    String nume;
    int greutate;
    
    public void seJoaca(){
        System.out.println("Pisica " + this.nume + " se joaca");
    }
    
    @Override
    public void mananca(){
        System.out.println("Pisica "+ this.nume + " mananca " + this.tipMancare);
    }
}