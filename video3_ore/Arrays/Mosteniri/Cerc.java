package Mosteniri;

public class Cerc extends Punct{
    double raza; //adaugare de atribute pentru PARTICULARIZARE
    //HIDING FIELDS(nu recomand)
    String x; // se ASCUNDE ATRIBUTUL initial x si se modifica prin String

    public Cerc(){
        this(2.4); //apel catre o supraincarcare de constructor din clasa curenta/in care se fol
    }
    
    //public Cerc(){ cauta constructorul fara parametri
    //    super(2,3); //apel catre constructorul clasei superioare
    //}
    
    public Cerc(double raza){
        super(2,3); //specificat in mod explicit super deci el cauta constructor FARA PARAMETRI daca in super nu am parametri
        this.raza = raza;
        super.x = 10; //initializeaza x ul din instanta clasei superioare
        this.x = "Buna!";//hiding fields
        
        
    }
    
    public double getArie(){
        //adaugare de comportament
        return 3.14 * this.raza * this.raza;
    }
    
    
    public double getLungime(){
        return 2*3.14*this.raza;
    }
    
}

