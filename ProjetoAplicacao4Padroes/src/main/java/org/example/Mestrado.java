package org.example;

public class Mestrado implements Escolaridade {

    private static Mestrado instance;

    private Mestrado() {}

    public static Mestrado getInstance() {
        if (instance == null) {
            instance = new Mestrado();
        }
        return instance;
    }

    public float percentualAumento() {
        return 0.2f;
    }

}
