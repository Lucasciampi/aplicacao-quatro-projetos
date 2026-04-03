package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoriaIntermediarioTest {

    @Test
    void deveRetornaroPercentualDaCategoriaBasico() {
        Categoria categoria = CategoriaFactory.getInstance().obterCategoria("Intermediario");
        assertEquals(0.75f, categoria.percentualCobertura());
    }
}
