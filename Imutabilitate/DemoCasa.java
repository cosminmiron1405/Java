public class DemoCasa{
    public static void main(String [] args){
        Casa c1 = new Casa(4, 150, "Iuliu Maniu");
        Casa c2 = new Casa(3, 120, "Pinului");
        
        
        //c1.nrCamere = 4; - nu merge ca e private
        //c2.setMPatrati(200); - nu merge ca nu e declarat
        System.out.println("Casa 1 are urmatoarele prop: " + c1.getNrCamere() + " camere, " + c1.getMPatrati() + " mp, si se afla pe strada " + c1.getAdresa());
        //analog c2
    }
}