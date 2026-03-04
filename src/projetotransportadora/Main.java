package projetotransportadora;

public class Main {
    public static void main(String[] args) {

        Caminhao novoCaminhao = new Caminhao("87BI100TJ", 100.00);

        try {
            Pacote pacote1 = new Pacote("71092930", 27.83);
            Pacote pacote2 = new Pacote("18350241", 42.12);
            Pacote pacote3 = new Pacote("54391082", 31.68);

            novoCaminhao.adicionarPacote(pacote1);
            novoCaminhao.adicionarPacote(pacote2);
            novoCaminhao.adicionarPacote(pacote3);


        } catch (IllegalArgumentException e) {
            System.out.println("\nNão foi possivel adicionar: " + e.getMessage());
        }

        novoCaminhao.getInfoCaminhao();
    }

}
