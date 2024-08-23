public class DemoArray1{
    public static void main(String[] args){
        int [] array = new int[5];
        
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
        
        int[] array1 = new int[] {5, 6, 7, 8, 9};
        
        System.out.println(array[3]);
        
        for(int i = 0 ; i<array.length ; i++)
            System.out.println(array[i]);
        
    }
}