public class DemoSystem{
    public static void main(String [] args){
        long start = System.currentTimeMillis();
        System.out.println(start);
        
        int [] array1 = new int[]{7, 2, 4, 9, 1, 3};
        int [] array2 = new int[3];
        
        for(int i : array2){
            System.out.println(i + " ");
        }
        System.out.println();
        
        System.arraycopy(array1, 2, array2, 0, 3);
        
        for(int i : array2){
            System.out.println(i + " ");
        }
        
    }
}