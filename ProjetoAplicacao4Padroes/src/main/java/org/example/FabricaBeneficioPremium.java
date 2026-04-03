package org.example;

public class FabricaBeneficioPremium implements FabricaAbstrataBeneficios {

    @Override
    public Categoria criarCategoria() {
        return CategoriaFactory.getInstance().obterCategoria("Premium");
    }

    @Override
    public Beneficio criarBeneficio() {
        Beneficio beneficio = new BeneficioSeguroVida(criarCategoria());
        beneficio.setValorBase(500.0f);
        return beneficio;
    }
}
