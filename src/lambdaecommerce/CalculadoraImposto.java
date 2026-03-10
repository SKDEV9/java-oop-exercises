package lambdaecommerce;


import java.math.BigDecimal;

@FunctionalInterface
interface CalculadoraImposto {

     BigDecimal aplicar(BigDecimal preco);
}
