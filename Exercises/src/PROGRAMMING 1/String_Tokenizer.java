package src;

import java.util.StringTokenizer;

public class String_Tokenizer {
    public static void main(String[] args) {

        String palabras = "L;a c-a-s-a,esta en,la,playa";
        StringTokenizer tokens = new StringTokenizer(palabras,",;-");

        while (tokens.hasMoreTokens()) {

            System.out.println(tokens.nextToken());
        }
    }
}
