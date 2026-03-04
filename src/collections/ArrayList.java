package collections;

public class ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList<String> people = new java.util.ArrayList<>();

        // Adicionando itens no array (Strings)
        people.add("Samuel");
        people.add("Pedro");
        people.add("Nicolas");

        // Removendo um item especifico pelo nome
        people.remove("Pedro");

        // Removendo o item pelo index
        people.remove(1);

        // Verificando se um item esta presente na lista
        if (people.contains("Nicolas")) {
            System.out.println("Nicolas is in the list.");
        }

        // Verificando se o array esta vazio
        if (people.isEmpty()) {
            System.out.println("The list is empty.");
        }

        // Removendo todos os itens do array
        people.clear();
    }
}
