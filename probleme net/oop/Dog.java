public class Dog{
    String name;
    String breed;
    
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setBreed(String newBreed){
        this.breed = newBreed;
    }
    
    public void Afisare(){
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}