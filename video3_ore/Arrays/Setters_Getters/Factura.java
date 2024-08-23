package Setters_Getters;

public class Factura{
    //setter si getter
    //clasa encapsulata
    private String nume;
    private double total;
    private boolean platita;
    
    public String getNume(){
        return this.nume;
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    
    public double getTotal(){
        return this.total;
    }
    public void setTotal(double total){
        if(total > 0)
            this.total = total;
        else
            System.out.println("Invalid! Introdu o val pozitiva!");
    }
    
    public boolean isPlatita(){
        return this.platita;
    }
    public void setPlatita(boolean platita){
        this.platita = platita;
    }
    
    
}
