package heranca;

public class Funcionario {

    //Protected -> Acessivel apenas para as classes filhas
    protected  String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void baterPonto() {
        System.out.printf("\n%s registrou ponto.", this.nome);
    }

}
