package exercicioscollections;
import java.util.*;

public class FintechAntiFraude {
    public static void main(String[] args) {

        List<String> usuariosPix = new ArrayList<>();

        usuariosPix.add("87901837-10");
        usuariosPix.add("24510918-61");
        usuariosPix.add("65192038-72");
        usuariosPix.add("43629637-15");
        usuariosPix.add("87901837-10");   // Duplicidade proposital, simulando que o individuo tentou fazer + de um pix hoje

        Set<String> cpfsBloqueados = new HashSet<>();

        cpfsBloqueados.add("73615382-28");
        cpfsBloqueados.add("80906951-87");

        Map<String, Double> bancoDeSaldos = new HashMap<>();

        bancoDeSaldos.put("87901837-10", 1490.00);
        bancoDeSaldos.put("65192038-72", 2977.56);
        bancoDeSaldos.put("43629637-15", 4589.21);


        for (Map.Entry<String, Double> entry : bancoDeSaldos.entrySet()) {
            String chave = entry.getKey();
            Double valor = entry.getValue();
            System.out.printf("\nCliente com o CPF: [ %s ] possui saldo de R$ %.2f\n", chave, valor);
        }

    }
}
