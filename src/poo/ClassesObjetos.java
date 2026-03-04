package poo;

public class ClassesObjetos {
    public static void main(String[] args) {

        // Criando uma instância de Usuario
        Usuario novoUsurio = new Usuario("Samuel", "sk@gmail");

        // Chamando o método apresentar, responsavel pela saudação
        novoUsurio.apresentar();

    }

    // A classe (Molde)
    public static class Usuario {
        String nome;
        String email;

        // O Construtor, método especial chamado ao criarmos um objeto
        public Usuario(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }

        // Método (Ação)
        public void apresentar () {
            System.out.printf("\nOlá, meu nome é %s \n", this.nome);
        }
    }
}
