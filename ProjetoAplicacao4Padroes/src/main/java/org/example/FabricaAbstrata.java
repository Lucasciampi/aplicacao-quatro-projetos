package org.example;

public interface FabricaAbstrata {

    Cargo criarCargo(float salarioBase);
    Escolaridade criarEscolaridade(String tipoEscolaridade);

}
