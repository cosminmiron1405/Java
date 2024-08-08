public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int x = 3;
        //System.out.println(a++); // printeaza si dupa incrementeaza
        //System.out.println(++b); // incrementeaza si dupa printeaza

        int rezultat = x++ + (++x)*3 + --x;
        //             (1)    (2)      (3)
        //(1) rezultat = 3 + ....
        //x = x+1 = 4
        //(2)rezultat = 3 + 5
        //x = 4 + 1 = 5 mai intai se incrementeaza
        //(3) rezultat = 3 + 5*3 + 4
        //x = x - 5 mai intai se decrementeaza
        System.out.println(rezultat);
    }
}