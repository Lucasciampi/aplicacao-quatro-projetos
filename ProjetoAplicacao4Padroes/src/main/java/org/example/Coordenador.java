package org.example;

public class Coordenador extends Cargo {

    public Coordenador(FabricaAbstrata fabrica, float salarioBase) {
        super(fabrica, salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.escolaridade.percentualAumento());
    }

}
