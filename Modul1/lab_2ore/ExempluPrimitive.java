/**
 * Comentariu de documentatie !!!
 @autor aaaasa
 @Exemplu cu primitive, string, comentarii
 */

public class ExempluPrimitive{
    public static void main(String[] args){
        byte b1 = 10; //nr intreg de maxim 1byte [-128;127]
        byte b2 = 20;
        
        short s1, s2, s3; //numere intregi de tip short
        int i1 = 10;
        long l1 = 20;
        
        int q1 = 04; //variabila in octal [0;7]
        int q2 = 0x0F; //variabila in hexazecimal
        int q3 = 0b10100011; // variabila in binar
        
        System.out.println(q2);
        long w1 = 1_000_000; // _ este un separator pentru a fi mai clar un numar mai lung, poate fi folosita doar intre 2 cifre
        long k = 1_000_000_000_000L; //L/l este un literal care indica programului ca folosim un long (se uita mai intai in dreapta si creade ca e un int prea mare)
        float f1 = 10.5F; // aici o sa creada ca e un double, motiv pentru care daca vede float ar trebui sa faca o trunchiere din double in long (se pierde din precizie)
        float f2 = (float)10.5; //operator de conversie explicita = tipul la care se converteste valoarea
        double d1 = 10.5;
        boolean bol1 = true;
        boolean bol2 = !false;
        
        char c1 = 'a';// ' ' pentru un singur caracter
        char c2 = '\u0235'; // caracter/simbol din tabela UNICODE
        System.out.println(c2);
        char c3 = '\n'; // new line
        
        //Stringul nu este o primitiva, poate fi vazut ca un SIR DE CARACTERE => un derivat al primitivei char
        String sir = "Ana are mere!";
        System.out.println(sir);
        
        System.out.println(c2 + " " + f1 + "\n" + sir);
        
    }
}