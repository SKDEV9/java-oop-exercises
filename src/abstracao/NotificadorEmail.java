package abstracao;

public class NotificadorEmail implements Notificador {

    @Override
    public void enviar(String mensagem) {
        System.out.printf("Conectando ao Servidor SMTP... Enviando email: %s", mensagem);
    }
}
