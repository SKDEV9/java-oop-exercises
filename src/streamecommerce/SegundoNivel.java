package streamecommerce;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SegundoNivel {

    public BigDecimal somaDoPedido(Pedido pedido) {

        return pedido.produto()
                .stream()
                .map(Produto::preco)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }


    public Optional<Produto> produtoMaisCaro(List<Produto> produtos) {

        return produtos.stream()
                .max(Comparator.comparing(Produto::preco));
    }


    public boolean verificacaoDeMaioridade(List<Cliente> clientes) {

        return clientes.stream()
                .allMatch(cliente -> cliente.idade() >= 18);
    }

}