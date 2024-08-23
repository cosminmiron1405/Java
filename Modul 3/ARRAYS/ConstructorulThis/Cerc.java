public class Cerc{
    int x;
    int y;
    double raza;
    
    Cerc(int x, int y, double raza){
        this.x = x;
        this.y = y;
        this.raza = raza;
    }
    
    Cerc(double raza, int x, int y){
        this.x = x;
        this.y = y;
        this.raza = raza;
    }
    
    Cerc(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    Cerc(double raza){
        this.raza = raza;
    }
    
}