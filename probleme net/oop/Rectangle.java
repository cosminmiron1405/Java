public class Rectangle{
    int width;
    int height;
    
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    public int Area(int width, int height){
        return width * height;
    }
    
    public int Perimeter(int width, int height){
        return 2 * (width + height);
    }
}