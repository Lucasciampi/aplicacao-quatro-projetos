package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class ColaboradorTest {

    @Test
    void deveCalcularCustoBeneficioBasico() {
        FabricaAbstrataBeneficios fabrica = new FabricaBeneficioBasico();
        Colaborador colaborador = new Colaborador(fabrica);

        assertEquals(250.0f, colaborador.calcularCustoBeneficio());
    }

    @Test
    void deveCalcularCustoBeneficioIntermediario() {
        FabricaAbstrataBeneficios fabrica = new FabricaBeneficioIntermediario();
        Colaborador colaborador = new Colaborador(fabrica);
        assertEquals(375.0f, colaborador.calcularCustoBeneficio());
    }

    @Test
    void deveCalcularCustoBeneficioPremium() {
        FabricaAbstrataBeneficios fabrica = new FabricaBeneficioPremium();
        Colaborador colaborador = new Colaborador(fabrica);
        assertEquals(550.0f, colaborador.calcularCustoBeneficio());
    }
}