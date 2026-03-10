package lambdaecommerce;

import java.math.BigDecimal;
import java.util.List;

public class ImpostoService {


    public List<BigDecimal> processarImpostos(List<Item> itens, BigDecimal taxaBase) {

        // Tratando um possivel erro caso a taxa base venha negativa
        BigDecimal taxaValidada = (taxaBase.compareTo(BigDecimal.ZERO) < 0) ? BigDecimal.ZERO : taxaBase;

        CalculadoraImposto calcular = (preco -> preco.add(taxaValidada));

        return  itens.stream()
                .map(Item::preco)
                .map(calcular::aplicar)
                .toList();

    }
}
