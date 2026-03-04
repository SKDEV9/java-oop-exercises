package projetotransportadora;


public class Pacote {

    private String codigoRastreio;
    private Double pesoEmKg;


    public Pacote(String codigoRastreio, Double pesoEmKg) {
        this.codigoRastreio = codigoRastreio;
        this.pesoEmKg = pesoEmKg;
    }


    public String getCodigoRastreio() {
        return this.codigoRastreio;
    }


    public Double getPesoEmKg() {
        return this.pesoEmKg;
    }

}
