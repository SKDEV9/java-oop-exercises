package abstracao;

public class Main {
    public static void main(String[] args) {

        NotificadorEmail novoEmail = new NotificadorEmail();

        novoEmail.enviar("Apenas um email de teste!");
    }
}
