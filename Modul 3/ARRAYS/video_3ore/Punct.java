public class Punct{
    int x;
    int y;
    static int z;
    
    Punct(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //comportament pentru calcularea distantei intre 2 puncte
    double getDistance(Punct p){
        //this, p-?cele 2 puncte(this-> punctul din care dereferentiez metoda, iar p este Punctul)
        double rez =  Math.sqrt((this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y));
        return rez;
    }
    
    //metoda statica
    static void afisareZ(){
        System.out.println(z);
    }
    
    
}