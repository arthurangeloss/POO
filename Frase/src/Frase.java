import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class Frase {
    public static void main(String[] args) throws Exception {
     Scanner ler = new Scanner(System.in);
        System.out.println("Escreva uma frase: ");
        String frase = ler.nextLine();
        
        int numVog = 0;
        for(int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){

                
 
                numVog++;
       }   
    }
    System.out.println ("A frase digitada contem " + numVog + " vogais.");
 }
}