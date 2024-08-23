public class Exemplu2{
    public static void main(String[] args){
        int [][]m = new int [5][5];
        
        for(int i = 0 ; i<m.length ; i++){
            System.out.println("----" + m.length + "-----");
            for(int j = 0 ; i<m[i].length ; j++){
                m[i][j] = i+j;
            }
        }
        System.out.println("\n=========\n");
        
        for(int[] x:m){
            for(int i:x){
                System.out.println(i);
            }
            System.out.println();
        }
    }
}