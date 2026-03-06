package streamecommerce;

import java.util.List;

public class PrimeiroNivel {

    public List<String> clientesAtivos(List<Cliente> clientes) {

        return clientes.stream()
                .filter(Cliente::ativo)
                .map(Cliente::nome)
                .toList();
    }

    public List<Produto> catalogoEletronicos(List<Produto> produtos) {

        return produtos.stream()
                .filter(produto -> produto.categoria() == CategoriaProduto.ELETRONICO)
                .toList();
    }
}
