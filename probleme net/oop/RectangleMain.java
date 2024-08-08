public class RectangleMain{
    public static void main(String[] args){
        Rectangle rec1 = new Rectangle(3, 5);
        int area = rec1.Area(3, 5);
        int perimeter = rec1.Perimeter(3, 5);
        
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        
    }
}