package expressaolambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

        // Sem expressão lambda
        OperacaoMatemantica soma = new OperacaoMatemantica() {
            @Override
            public int calcular(int a, int b) {
                return a + b;
            }
        };

        System.out.println(soma.calcular(5, 3));

        // Usando expressão lambda para soma
        OperacaoMatemantica somaComLambda = (a, b) -> a + b;

        System.out.println(somaComLambda.calcular(5, 3));

        // Usando expressão lambda para multiplicacao
        OperacaoMatemantica multiplicacao = (a, b) -> a * b;

        System.out.println(multiplicacao.calcular(3, 2));


        // Manipulação de String

        // Sem usar lambda
        ManipularString maiuscula = new ManipularString() {
            @Override
            public String Manipular(String str) {
                return str.toUpperCase();
            }
        };

        System.out.println(maiuscula.Manipular("samuel"));


        // Usando expressão lambda
        ManipularString lambdaMaiuscula = str -> str.toUpperCase();

        System.out.println(lambdaMaiuscula.Manipular("samuel"));


        // Usando Filter sem usar lambda

        List<String> palavras = Arrays.asList("java", "lambda", "javanautas", "spring");

        List<String> palavrasFiltradas = new ArrayList<>();

        for(String palavra : palavras) {

            if(palavra.length() > 5) {
                palavrasFiltradas.add(palavra);
            }
        }

        System.out.println("Palavras com mais de 5 letras sem função lambda: " + palavrasFiltradas);

        // Usando Filter com lambda
        List<String> palavrasFiltradasFL = palavras.stream()
                .filter(palavra -> palavra.length() > 5)
                .toList();


        System.out.println("\nPalavras com mais de 5 letras com função lambda: " + palavrasFiltradasFL);


        // Filtros com objetos

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Alice", 25),
                new Pessoa("Bob", 30),
                new Pessoa("Charlie", 22)
        );

        List<String> nomes = pessoas.stream()
                .map(Pessoa::getNome)
                .toList();


        List<Integer> idades = pessoas.stream()
                .map(Pessoa::getIdade)
                .toList();


        System.out.println("Lista de nomes: " + nomes + "\nLista de idades:  " + idades);
    }

}
