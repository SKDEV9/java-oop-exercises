package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploForEach {
    public static void main(String[] args) {

        List<String> frutas = Arrays.asList("Maçã", "Banana", "Laraja");

        // Imprimindo cada fruta no console
        frutas.stream().
                forEach(fruta -> System.out.println("Eu gosto de " + fruta));
    }
}
