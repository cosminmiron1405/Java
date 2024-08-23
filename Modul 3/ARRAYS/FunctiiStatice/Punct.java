public class Punct{
    int x;
    int y;
    static int z;
    
    static double calcDist(){
        z++;//doar atributele statice pot fi fol in metode statice
        //x++; atributele care nu sunt statice nu pot fi fol in metode statice
        return 0.0;
    }
}