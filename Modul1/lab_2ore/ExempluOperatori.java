public class ExempluOperatori{
    public static void main(String[] args){
        boolean b1 = 3 > 4; // false
        boolean b2 = 5==5; //true
        boolean b3 = 4 == 6;//false
        boolean b4 = 10 != 89; //true
        
        boolean b5 = true;
        boolean b6 = false;
        boolean b7 = b5 && b6; // se uita si la b8 pentru ca primul e true
        boolean b8 = b6 && b7; // aici nu se mai uita la b7 pentru ca primul e false fiind operator cu 2 && (scurtcircuitat)
        boolean b9 = b6 & b7; // aici se uita obligatoriu la ambii pentru ca standard (are un singur &)
        System.out.println(b7);
        
        int a = 3;
        int b = 10;
        
        
        
        
    }
}