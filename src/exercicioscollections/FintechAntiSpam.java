package exercicioscollections;
import java.util.*;


public class FintechAntiSpam {
    public static void main(String[] args) {

        List<String> usuariosPix = new ArrayList<>();

        usuariosPix.add("87901837-10");
        usuariosPix.add("24510918-61");
        usuariosPix.add("65192038-72");
        usuariosPix.add("43629637-15");
        usuariosPix.add("87901837-10"); // Duplicidade proposital para validar o tratamento de excecões
        usuariosPix.add("80906951-87");



        Map<String, Integer> contagemTentativas = new HashMap<>();


        for (String cpf : usuariosPix) {
            Integer contagem = contagemTentativas.get(cpf);

            //Verificando se o CPF está presente no Map, se não estiver adicionamos ele com o valor inical de 1 tentativa
            if (! contagemTentativas.containsKey(cpf)) {
                contagemTentativas.put(cpf, 1);
                continue;

            } else {
                contagem += 1;
                contagemTentativas.put(cpf, contagem);  // Atualizando os valores no Map
            }
        }

        for (Map.Entry<String, Integer> entry : contagemTentativas.entrySet()) {
            String chave = entry.getKey();
            Integer valor = entry.getValue();

            // Validando um provavel SPAM caso o número de tentativas for maior que 1
            if (valor > 1) {
                System.out.printf("\n[ALERTA DE SPAM] O CPF %s tentou realizar %d transações hoje.\n", chave, valor);
                continue;
            }

            System.out.printf("\nO CPF %s tentou realizar %d transação hoje.\n", chave, valor);

        }
    }
}
