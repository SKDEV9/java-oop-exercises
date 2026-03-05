package streamrelatoriologistica;

import java.util.List;

public class ServicoLogistica {

    public List<String> extrairNomesDeItensEntregues(List<Pedido> pedidos){

        return pedidos.stream()
                .filter(Pedido::entregue)
                .flatMap(pedido -> pedido.itens().stream())
                .map(Item::nome)
                .distinct()
                .sorted()
                .toList();
    }
}
