public class Caine{
    int varsta;
    String culoare;
    String rasa;
    double greutate;
    
    /*Caine(){
        //rezerva spatiul in memorie pentru un obiect de tip caine
        
    }
    */
   
    Caine(int varsta, String culoare, String rasa, double greutate){
        //Atributul/variabila din clasa Caine(stanga) = parametrul primit prin constructor, practic o valoare (dreapta)
        this.varsta = varsta;
        this.culoare = culoare;
        this.rasa = rasa;
        this.greutate = greutate;
        //ca pentru prosti, folosesti this ca sa nu se incurce atributele cu parametrii primiti prin constructor
    }
    
    
    //metode(OOP) = comportament(JAVA) same thing
    void latra(){
        System.out.println("Ham-Ham!");
    }
    
    void doarme(){
        if(this.varsta <= 1){
            System.out.println("Cainele doarme 2 ore");
        }
        else if(this.varsta >= 1 && this.varsta <=5){
            System.out.println("Cainele doarme 5 ore");
        }
        else {
            System.out.println("Cainele doarme 7 ore");
        }
    }
    
    void mananca(){
        
    }
}