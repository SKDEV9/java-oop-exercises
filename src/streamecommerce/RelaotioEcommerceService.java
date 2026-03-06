package streamecommerce;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public record RelaotioEcommerceService() {}

 enum CategoriaProduto {ELETRONICO, LIMPEZA, FERRAMENTA}


 record Produto(
         String id,
         String nome,
         CategoriaProduto categoria,
         BigDecimal preco
 ) {}


 record Cliente(
         String id,
         String nome,
         int idade,
         boolean ativo
 ) {}


 record Pedido(
         String id,
         Cliente cliente,
         List<Produto> produto,
         LocalDate dataPedido)
 {}
