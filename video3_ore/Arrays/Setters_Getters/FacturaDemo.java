package Setters_Getters;

public class FacturaDemo{
    public static void main(String [] args){
        Factura factura = new Factura();
        
        factura.setNume("Marcelo");
        System.out.println(factura.getNume());
        
        factura.setTotal(-4245.39);
        System.out.println(factura.getTotal());
        
        factura.setPlatita(true);
        System.out.println(factura.isPlatita());
    }

}
