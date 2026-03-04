package heranca;

public class Main {
    public static void main(String[] args) {

        // Criando uma instacia de Funcionario
        Funcionario novoFuncionario = new Funcionario("Pedro");

        novoFuncionario.baterPonto();

        // Criando uma instacia de Desenvolvedor que herda de Funcionario
        Desenvolvedor novoDev = new Desenvolvedor("Samuel", "Java");

        novoDev.baterPonto();

        novoDev.getInfo();
    }
}
