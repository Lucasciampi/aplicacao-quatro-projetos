package org.example;

public class BeneficioPlanoOdontologico extends Beneficio {

    public BeneficioPlanoOdontologico(Categoria categoria) {
        super(categoria);
    }

    @Override
    public float calcularCustoParaEmpresa() {
        return getValorBase() * getCategoria().percentualCobertura();
    }
}
