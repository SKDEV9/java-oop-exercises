package projetotransportadora;
import java.util.ArrayList;
import java.util.List;

public class Caminhao {

    private String placa;
    private Double capacidadeMaximaEmKg;
    private List<Pacote> pacotes = new ArrayList<>();
    private Double pesoTotal = 0.0;



    public Caminhao(String placa, Double capacidadeMaximaEmKg) {
        this.placa = placa;
        this.capacidadeMaximaEmKg = capacidadeMaximaEmKg;
    }


    public void adicionarPacote(Pacote pacoteNovo) {

        double pesoDoPacoteNovo = pacoteNovo.getPesoEmKg();


        if (pesoTotal + pesoDoPacoteNovo > capacidadeMaximaEmKg) {
            throw new IllegalArgumentException("Peso máximo ultrapassado!");

        } else {
            pesoTotal += pesoDoPacoteNovo;
            pacotes.add(pacoteNovo);

        }
    }

    public Double getPesoTotalCarregado() {
        return this.pesoTotal;
    }


    public void getInfoCaminhao() {
        System.out.printf("\nPeso total do caminhão [ %s ] -> %.2f kg.\n", this.placa, this.pesoTotal);
    }
}
