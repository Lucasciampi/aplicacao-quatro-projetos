package org.example;

public class FabricaBeneficioBasico implements FabricaAbstrataBeneficios {

    @Override
    public Categoria criarCategoria() {
        return CategoriaFactory.getInstance().obterCategoria("Basico");
    }

    @Override
    public Beneficio criarBeneficio() {
        Beneficio beneficio = new BeneficioPlanoOdontologico(criarCategoria());
        beneficio.setValorBase(500.0f);
        return beneficio;
    }
}
