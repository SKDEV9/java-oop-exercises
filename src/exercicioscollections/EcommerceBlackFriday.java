package exercicioscollections;
import java.util.*;

public class EcommerceBlackFriday {
    public static void main(String[] args) {

        Map<String, Double> produtos = new HashMap<>();

        produtos.put("83517", 27.90);
        produtos.put("37528", 6.49);
        produtos.put("51026", 8.59);
        produtos.put("17350", 7.21);


        Set<String> produtosEmPromocao = new HashSet<>();

        produtosEmPromocao.add("83517");
        produtosEmPromocao.add("51026");

        // Simulando o carrinho do cliente com itens em promoção e itens que não estão em promoção
        List<String> carrinhoCliente = new ArrayList<>();

        carrinhoCliente.add("51026");   // Item em promoção
        carrinhoCliente.add("17350");   // Item fora de promoção
        carrinhoCliente.add("37528");   // Item fora de promoção


        double valorTotal = 0.0;


        // Iterando sobre o carrinho do cliente para buscar o preço do respectivo produto
        for (String codigoProduto : carrinhoCliente) {
            Double valor = produtos.get(codigoProduto);

            if (valor != null) {
                /*
                Aqui a estrutura de decisâo análisa se um ou mais produtos se
                encontram em promoção, se sim, o produto recebe um desconto de 20% se não,
                recebe seu valor cheio.
                */
                if (produtosEmPromocao.contains(codigoProduto)) {
                    valor *= 0.80;
                    valorTotal += valor;

                } else {
                    valorTotal += valor;
                }
            }
        }


        System.out.printf("Total do carrinho: R$ %.2f", valorTotal);

    }
}
