package org.example;

public class Colaborador {

    private Categoria categoria;
    private Beneficio beneficio;

    public Colaborador(FabricaAbstrataBeneficios fabrica) {
        this.categoria = fabrica.criarCategoria();
        this.beneficio = fabrica.criarBeneficio();
    }

    public float calcularCustoBeneficio() {
        return this.beneficio.calcularCustoParaEmpresa();
    }

}
