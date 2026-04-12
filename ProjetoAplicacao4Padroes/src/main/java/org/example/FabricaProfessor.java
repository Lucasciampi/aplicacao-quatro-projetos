package org.example;

public class FabricaProfessor implements FabricaAbstrata {

    private static FabricaProfessor instance;

    private FabricaProfessor() {}

    public static FabricaProfessor getInstance() {
        if (instance == null) {
            instance = new FabricaProfessor();
        }
        return instance;
    }

    public Professor criarCargo(float salarioBase) {
        return new Professor(this, salarioBase);
    }

    public Escolaridade criarEscolaridade(String tipoEscolaridade) {
        return EscolaridadeFactory.getInstance().obterEscolaridade("Mestrado");
    }

}
