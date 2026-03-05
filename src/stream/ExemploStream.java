package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos", "Daniela", "Alberto");

        // Queremos apenas os nomes que começam com a letra "A"
        List<String> nomesComA = nomes.stream()
                .filter(nome -> nome.startsWith("A"))
                .toList();


        System.out.println(nomesComA);
    }
}
