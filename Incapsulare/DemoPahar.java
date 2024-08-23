public class DemoPahar{
    public static void main(String [] args){
        
        Pahar p1 = new Pahar();
        
        p1.setCuloare("verde");
        p1.setVolum(300);
        p1.setPlin(true);
        
        System.out.println(p1.getVolum() + "ml");
        System.out.println(p1.getCuloare());
        System.out.println(p1.isPlin());
    }
}