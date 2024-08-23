public class Exemplu1{
    public static void main(String[] args){
        int [] x = new int[5];
        //<tip de date> [] <identificator> = new <tip> [dimensiune]
        
        x[0] = 1;
        x[1] = 3;
        x[4] = 5;
        //vectorul are n elemente; de la 0 la n-1
        
        for(int i = 0; i<x.length; i++){
            System.out.println(x[i] + " ");
        }
        
        for(int i : x){
            System.out.println(i);
        }
        
        for(int i : x){
            if(i%2 == 0){
                System.out.println("valoare para");
            }
        }
    }
}