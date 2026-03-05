package streamrelatoriologistica;
import java.math.BigDecimal;
import java.util.List;


record Item(String nome, BigDecimal preco) {}

public record Pedido(String id, boolean entregue, List<Item> itens) {}
