package org.example;

public class BeneficioPlanoSaude extends Beneficio {

    public BeneficioPlanoSaude(Categoria categoria) {
        super(categoria);
    }

    @Override
    public float calcularCustoParaEmpresa() {
        return getValorBase() * getCategoria().percentualCobertura();
    }
}
