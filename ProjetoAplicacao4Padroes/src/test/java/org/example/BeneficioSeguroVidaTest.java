package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeneficioSeguroVidaTest {

    @Test
    void deveRetornarValorSeguroVidaBasico() {
        CategoriaBasico categoria = new CategoriaBasico();
        BeneficioSeguroVida beneficio = new BeneficioSeguroVida(categoria);
        beneficio.setValorBase(100.0f);
        assertEquals(55.0f, beneficio.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorSeguroVidaIntermediario() {
        CategoriaIntermediario categoria = new CategoriaIntermediario();
        BeneficioSeguroVida beneficio = new BeneficioSeguroVida(categoria);
        beneficio.setValorBase(100.0f);
        assertEquals(82.5f, beneficio.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorSeguroVidaPremium() {
        CategoriaPremium categoria = new CategoriaPremium();
        BeneficioSeguroVida beneficio = new BeneficioSeguroVida(categoria);
        beneficio.setValorBase(100.0f);
        assertEquals(110.0f, beneficio.calcularCustoParaEmpresa());
    }
}
