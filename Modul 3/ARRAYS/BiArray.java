public class BiArray{
    public static void main(String[]args){
        int [][] matrice = new int [5][5];
        
        for (int i = 0 ; i<matrice.length ; i++){
            for(int j = 0 ; j<matrice[i].length ; j++){
                matrice[i][j] = i + j;
            }
        }
        
        for (int i = 0 ; i<matrice.length ; i++){
            for(int j = 0 ; j<matrice[i].length ; j++){
                System.out.println(matrice[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}