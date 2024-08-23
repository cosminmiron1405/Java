package Video;


public class DemoBanca{
    public static void main(String []args){
        ING ing1 = new ING("sucursala 454");
        ING ing2 = new ING("sucursala 771");
        
        BCR bcr1 = new BCR("sucursala b001", 1.2);
        BCR bcr2 = new BCR("sucursala b051", 4.4);
        
        ing1.afiseazaNume();
        System.out.print("are dobanda " + ing1.calculeazaDobanda());
        System.out.println("");
        
        ing2.afiseazaNume();
        System.out.print("are dobanda " + ing2.calculeazaDobanda());
        System.out.println("");
        
        bcr1.afiseazaNume();
        System.out.print("are dobanda " + bcr1.calculeazaDobanda());
        System.out.println("");
        
        bcr2.afiseazaNume();
        System.out.print("are dobanda " + bcr2.calculeazaDobanda());
        System.out.println("");
        
        //Banca b = new  Banca("Banca mea");
        
        
    }
}
