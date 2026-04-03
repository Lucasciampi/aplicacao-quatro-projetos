package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoriaPremiumTest {

    @Test
    void deveRetornaroPercentualDaCategoriaBasico() {
        Categoria categoria = CategoriaFactory.getInstance().obterCategoria("Premium");
        assertEquals(1.0f, categoria.percentualCobertura());
    }

}
