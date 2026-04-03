package org.example;

public class FabricaBeneficioIntermediario implements FabricaAbstrataBeneficios {

    @Override
    public Categoria criarCategoria() {
        return CategoriaFactory.getInstance().obterCategoria("Intermediario");
    }

    @Override
    public Beneficio criarBeneficio() {
        Beneficio beneficio = new BeneficioPlanoSaude(criarCategoria());
        beneficio.setValorBase(500.0f);
        return beneficio;
    }
}