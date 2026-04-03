package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoriaBasicoTest {

    @Test
    void deveRetornaroPercentualDaCategoriaBasico() {
        Categoria categoria = CategoriaFactory.getInstance().obterCategoria("Basico");
        assertEquals(0.5f, categoria.percentualCobertura());
    }

}