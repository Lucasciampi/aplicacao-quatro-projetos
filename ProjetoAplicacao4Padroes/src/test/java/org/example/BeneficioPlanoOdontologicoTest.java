package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeneficioPlanoOdontologicoTest {

    @Test
    void deveRetornarValorPlanoOdontologicoBasico() {
        CategoriaBasico categoria = new CategoriaBasico();
        BeneficioPlanoOdontologico beneficio = new BeneficioPlanoOdontologico(categoria);
        beneficio.setValorBase(100.0f);
        assertEquals(50.0f, beneficio.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorPlanoOdontologicoIntermediario() {
        CategoriaIntermediario categoria = new CategoriaIntermediario();
        BeneficioPlanoOdontologico beneficio = new BeneficioPlanoOdontologico(categoria);
        beneficio.setValorBase(100.0f);
        assertEquals(75.0f, beneficio.calcularCustoParaEmpresa());
    }

    @Test
    void deveRetornarValorPlanoOdontologicoPremium() {
        CategoriaPremium categoria = new CategoriaPremium();
        BeneficioPlanoOdontologico beneficio = new BeneficioPlanoOdontologico(categoria);
        beneficio.setValorBase(100.0f);
        assertEquals(100.0f, beneficio.calcularCustoParaEmpresa());
    }
}
