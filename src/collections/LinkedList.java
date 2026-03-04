package collections;

public class LinkedList {
    public static void main(String[] args) {

        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();

        // Adicionar os itens na lista
        list.add(1);
        list.add(2);
        list.add(3);


        // Removendo um item pelo seu index
        list.remove(0);


        // Removendo um item pelo seu valor
        list.remove(Integer.valueOf(3));


        // Removendo todos os itens da lista
         list.clear();


        // Adicionando itens a lista usando .offer
         list.offer(1);
         list.offer(2);
         list.offer(3);


        // Exibindo os valores na sua ordem dentro da lista
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());


        // Adicionando elementos usando o push
        list.push(1);
        list.push(2);
        list.push(3);


        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());


    }

}
