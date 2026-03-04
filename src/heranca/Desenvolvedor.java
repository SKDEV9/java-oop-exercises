package heranca;

public class Desenvolvedor extends Funcionario {

    private String linguagemFavorita;


    public Desenvolvedor(String nome, String linguagemFavorita) {

        // Chama o super construtor da classe Funcionario
        super(nome);
        this.linguagemFavorita = linguagemFavorita;
    }

    public void getInfo() {
        System.out.printf("\nA linguagem preferida do(a) Dev %s é: %s", this.nome, this.linguagemFavorita);
    }

}
