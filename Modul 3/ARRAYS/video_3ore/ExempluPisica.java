public class ExempluPisica{
    public static void main(String[] args){
        Pisica p1;//referinta
        p1 = new Pisica("Tazz ", " Negru ", 3);
        
        System.out.println(p1.nume + " " + p1.culoare + " " + p1.varsta); 
        
        p1.spuneMiau();
    }
}


    