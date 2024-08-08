public class Persoana{
    String name;
    int age;
    
    public Persoana(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    void Afisare(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}