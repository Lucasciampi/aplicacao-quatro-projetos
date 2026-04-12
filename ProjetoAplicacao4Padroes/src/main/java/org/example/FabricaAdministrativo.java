package org.example;

public class FabricaAdministrativo implements FabricaAbstrata{

    private static FabricaAdministrativo instance;

    private FabricaAdministrativo() {}

    public static FabricaAdministrativo getInstance() {
        if (instance == null) {
            instance = new FabricaAdministrativo();
        }
        return instance;
    }

    public Administrativo criarCargo(float salarioBase) {
        return new Administrativo(this, salarioBase);
    }

    public Escolaridade criarEscolaridade(String tipoEscolaridade) {
        return EscolaridadeFactory.getInstance().obterEscolaridade("EnsinoMedio");
    }

}
