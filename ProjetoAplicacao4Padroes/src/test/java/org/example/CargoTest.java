package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoTest {

    @Test
    void deveRetornarProfessorComMestrado() {
        FabricaProfessor fabrica = FabricaProfessor.getInstance();
        Professor professor = fabrica.criarCargo(100f);

        professor.setNumAulas(10);
        assertEquals(1200f, professor.calcularSalario());
    }

    @Test
    void deveRetornarAdministrativoComEnsinoMedio() {
        FabricaAdministrativo fabrica = FabricaAdministrativo.getInstance();
        Cargo cargo = fabrica.criarCargo(100f);
        assertEquals(100f, cargo.calcularSalario());
    }

}