package exercicioscollections;
import java.util.*;


public class FintechAntiFraudesV2 {

    public static void main(String[] args) {

        List<String> usuariosPix = new ArrayList<>();

        usuariosPix.add("87901837-10");
        usuariosPix.add("24510918-61");
        usuariosPix.add("65192038-72");
        usuariosPix.add("43629637-15");
        usuariosPix.add("87901837-10");   // Duplicidade proposital, simulando que o individuo tentou fazer + de um pix hoje
        usuariosPix.add("80906951-87");   // Adicionando um CPF bloqueado por fraude, para testar o tratamento de excecões

        Set<String> cpfsBloqueados = new HashSet<>();

        cpfsBloqueados.add("73615382-28");
        cpfsBloqueados.add("80906951-87");

        Map<String, Double> bancoDeSaldos = new HashMap<>();

        bancoDeSaldos.put("87901837-10", 1490.00);
        bancoDeSaldos.put("65192038-72", 2977.56);
        bancoDeSaldos.put("43629637-15", 4589.21);


        for (String cpf : usuariosPix) {

            if (cpfsBloqueados.contains(cpf)) {
                System.out.printf("\n[ALERTA] Operação negada! CPF [ %s ] bloqueado por fraude.\n", cpf);
                continue;
            }

            // Buscando o saldo desse CPF após verificar que ele não se encontra na lista de bloqueados
            Double valor = bancoDeSaldos.get(cpf);


            if (valor == null) {
                System.out.printf("\n[ERRO] Operação negada! CPF [ %s ] não possui conta neste banco.\n", cpf);
                continue;
            }

            System.out.printf("\n[SUCESSO] Operação liberada para o CPF [ %s ]. Saldo disponível: R$ %.2f\n", cpf, valor);

        }
    }
}

