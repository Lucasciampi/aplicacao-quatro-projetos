package org.example;

public class Administrativo extends Cargo {

    public Administrativo(FabricaAbstrata fabrica, float salarioBase) {
        super(fabrica, salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}