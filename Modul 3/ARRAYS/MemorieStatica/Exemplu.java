public class Exemplu{
    public static void main(String[] args){
        Punct p1 = new Punct();
        
        p1.z = 2; // valoarea lui z este 2
        
        System.out.println(p1.z);
        
        Punct.z = 10; // valoarea lui z este 10
        
        System.out.println(Punct.z);
    }
}