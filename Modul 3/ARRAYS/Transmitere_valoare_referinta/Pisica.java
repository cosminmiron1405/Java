public class Pisica{
    int varsta;
    String nume;
    double greutate;
    
    void transferPrinValoare(int varsta){
        varsta++;
        /*
         * modificarile din cadrul acestei metode se pastreaza doar la nivel
         * local, varsta fiind de fapt o copie a unui parametru trimis din
         * programul principal la apel
         */
    }
    
    void transferPrinReferinta(Pisica p1){
        p1.varsta++;
        /*
         * deoarece ca si parametru a fost transmisa o referinta a unei instante
         * de obiect a clasei Pisica, modificarile ce se efectueaza in cadrul
         * metodei, se vor pastra la nivel global
         */
    }
    
}