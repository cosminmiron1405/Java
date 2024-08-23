public class DemoMasina{
    public static void main(String[] args){
        Masina m1 = new Masina();
        
        m1.numar = "B10AQWI";
        m1.km = 50_000;
        
        Masina m2 = new Masina();
        m2.numar = "BR94ALE";
        m2.km = 200_000;
        
        System.out.println("Masina cu nr " + m1.numar + " are " + m1.km + "km sau in mile " + Masina.transformaKmInMile(m1.km));
        System.out.println("Masina cu nr " + m2.numar + " are " + m2.km + "km sau in mile " + Masina.transformaKmInMile(m2.km));
        
    }
}