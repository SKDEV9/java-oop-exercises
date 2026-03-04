package exercicioscollections;
import java.util.*;


public class RoteamentoDelogistica {
    public static void main(String[] args) {

        Map<String, String> prefixoDosCeps = new HashMap<>();

        prefixoDosCeps.put("581", "CENTRO");
        prefixoDosCeps.put("174", "ZONA SUL");
        prefixoDosCeps.put("293", "ZONA NORTE");


        Set<String> zonasBloqueadas = new HashSet<>();

        zonasBloqueadas.add("ZONA NORTE");

        List<String> cepsCompletos = new ArrayList<>();

        cepsCompletos.add("58127-900");
        cepsCompletos.add("17402-200");
        cepsCompletos.add("29361-500");
        cepsCompletos.add("12");    // Valor inválido proposital para teste de erro
        cepsCompletos.add("48192-100");     // Valor que não existe dentro do Map


        for (String cep: cepsCompletos) {

            if (cep.length() < 3) {
                System.out.printf("\nO CEP [ %s ] é inválido.\n", cep);
                continue;
            }

            String prefixo = cep.substring(0,3);

            String zona = prefixoDosCeps.get(prefixo);


            if (zona == null) {
                System.out.printf("\nO CEP [ %s ] -> Retido: Destino desconhecido.\n", cep);
                continue;

                
            } else if (zonasBloqueadas.contains(zona)) {
                System.out.printf("\nO CEP [ %s ] -> Retido: Entrega suspensa na [ %s ].\n", cep, zona);
                continue;
                
            } else  {
                System.out.printf("\nO CEP [ %s ] -> Liberado: Roteirizado para [ %s ].\n", cep, zona);

            }

        }

    }
}
