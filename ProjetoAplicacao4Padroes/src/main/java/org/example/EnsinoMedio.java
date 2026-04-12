package org.example;

public class EnsinoMedio implements Escolaridade {

    private static EnsinoMedio instance;

    private EnsinoMedio() {}

    public static EnsinoMedio getInstance() {
        if (instance == null) {
            instance = new EnsinoMedio();
        }
        return instance;
    }

    public float percentualAumento() {
        return 0.0f;
    }

}
