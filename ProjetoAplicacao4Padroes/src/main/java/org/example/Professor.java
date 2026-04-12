package org.example;

public class Professor extends Cargo {

    private int numAulas;

    public Professor(FabricaAbstrata fabrica, float salarioBase) {
        super(fabrica, salarioBase);
    }

    public void setNumAulas(int numAulas) {
        this.numAulas = numAulas;
    }

    public float calcularSalario() {
        return this.salarioBase * this.numAulas * (1 + this.escolaridade.percentualAumento());
    }
}