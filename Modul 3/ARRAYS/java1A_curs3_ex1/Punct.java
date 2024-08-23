 


public class Punct{
    int x;
    int y;
    
    Punct(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    int getDistance(Punct p1){
        int x;
        return (int) Math.sqrt((this.x - p1.x)*(this.x - p1.x) + (this.y - p1.y)*(this.y - p1.y));
        //return x;
    }
}
