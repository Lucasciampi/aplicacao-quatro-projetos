package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaridadeFactoryTest {

    @Test
    void deveRetornarExcecaoParaEscolaridadeInvalida() {
        try {
            EscolaridadeFactory.getInstance().obterEscolaridade("Doutorado");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Escolaridade inválida.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaEscolaridadeInexistente() {
        try {
            EscolaridadeFactory.getInstance().obterEscolaridade("Coordenador");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de Escolaridade não encontrada.", e.getMessage());
        }
    }

}