package org.example;

public abstract class Cargo {

    protected Escolaridade escolaridade;
    protected float salarioBase;

    public Cargo(FabricaAbstrata fabrica,float salarioBase) {
        this.escolaridade = fabrica.criarEscolaridade(null);
        this.salarioBase = salarioBase;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
