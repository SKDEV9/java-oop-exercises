package stream;

import java.util.Arrays;
import java.util.List;

public class ExemploCompleto {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(5, 12, 8, 20, 3, 15);

        // Queremos pegar os números maiores que 10, ordená-los e imprimi-los
        numeros.stream()
                .filter(n -> n > 10)
                .sorted()
                .forEach(System.out::println);
    }
}
