package org.example;

public class Doutorado implements Escolaridade {

    private static Doutorado instance;

    private Doutorado() {}

    public static Doutorado getInstance() {
        if (instance == null) {
            instance = new Doutorado();
        }
        return instance;
    }

    public float percentualAumento() {
        return 0.3f;
    }

}
