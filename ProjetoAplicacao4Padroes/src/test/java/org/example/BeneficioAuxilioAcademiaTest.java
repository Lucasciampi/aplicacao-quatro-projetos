package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeneficioAuxilioAcademiaTest {

    @Test
    void deveRetornarValorAuxilioAcademiaBasico() {
        CategoriaBasico categoria = new CategoriaBasico();
        BeneficioAuxilioAcademia beneficio = new BeneficioAuxilioAcademia(categoria);
        beneficio.setValorBase(100.0f);
        assertEquals(25.0f, beneficio.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorAuxilioAcademiaIntermediario() {
        CategoriaIntermediario categoria = new CategoriaIntermediario();
        BeneficioAuxilioAcademia beneficio = new BeneficioAuxilioAcademia(categoria);
        beneficio.setValorBase(100.0f);
        assertEquals(37.5f, beneficio.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorAuxilioAcademiaPremium() {
        CategoriaPremium categoria = new CategoriaPremium();
        BeneficioAuxilioAcademia beneficio = new BeneficioAuxilioAcademia(categoria);
        beneficio.setValorBase(100.0f);
        assertEquals(50.0f, beneficio.calcularCustoParaEmpresa());
    }
}
