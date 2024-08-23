public class DemoAdunare{
    public static void main(String[] args){
        
        Adunare a1 = new Adunare();
        
        //System.out.println(a1.aduna(10, 20));
        
        System.out.println(a1.aduna(2.3, 5.1));
        System.out.println(a1.aduna(2.3, 5.1, 10.01));
        
        int x = 3;
        double y = 23.5;
        
        System.out.println(a1.aduna(x, y));
        
    }
}