package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeneficioPlanoSaudeTest {

    @Test
    void deveRetornarValorPlanoSaudeBasico() {
        CategoriaBasico categoria = new CategoriaBasico();
        BeneficioPlanoSaude beneficio = new BeneficioPlanoSaude(categoria);
        beneficio.setValorBase(100.0f);
        assertEquals(50.0f, beneficio.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorPlanoSaudeIntermediario() {
        CategoriaIntermediario categoria = new CategoriaIntermediario();
        BeneficioPlanoSaude beneficio = new BeneficioPlanoSaude(categoria);
        beneficio.setValorBase(100.0f);
        assertEquals(75.0f, beneficio.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorPlanoSaudePremium() {
        CategoriaPremium categoria = new CategoriaPremium();
        BeneficioPlanoSaude beneficio = new BeneficioPlanoSaude(categoria);
        beneficio.setValorBase(100.0f);
        assertEquals(100.0f, beneficio.calcularCustoParaEmpresa());
    }
}
