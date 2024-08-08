public class DogMain{
    public static void main(String[] args){
        Dog dog1 = new Dog("Bruno", "Labradoodle");
        Dog dog2 = new Dog("Karla", "Pechinez");
        
        dog1.Afisare();
        dog2.Afisare();
        
        dog1.setName("Kratos");
        dog2.setName("Sasha");
        
        dog1.Afisare();
        dog2.Afisare();
        
    }
}