package exercicioscollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class SistemaBasicoRH {
    public static void main(String[] args) {

        List<String> logAcessos = new ArrayList<>();

        logAcessos.add("890275");
        logAcessos.add("776492");
        logAcessos.add("349827");
        logAcessos.add("890275");
        logAcessos.add("945125");
        logAcessos.add("349827");
        logAcessos.add("776492");
        logAcessos.add("945125");

        System.out.println(logAcessos);

        // Armazenando os setores da empresa
        Set<String> codigosSetoriais = new HashSet<>();

        codigosSetoriais.add("Desenvolvedor");
        codigosSetoriais.add("Gerente");
        codigosSetoriais.add("Analista");
        codigosSetoriais.add("Desenvolvedor"); // Duplicidade proposital

        // Criando o cátalogo de cargos
        Map<String, String> catalogoDeCargos = new HashMap<>();

        catalogoDeCargos.put("890275", "Desenvolvedor");
        catalogoDeCargos.put("349827", "Gerente");
        catalogoDeCargos.put("945125", "Analista");


        // Fazendo a iteração sobre o map
        for (Map.Entry<String, String> entry: catalogoDeCargos.entrySet()) {
            String chave = entry.getKey();
            String valor = entry.getValue();
            System.out.printf("Funcionário [ID: %s] atua como %s\n", chave, valor);
        }

    }
}
