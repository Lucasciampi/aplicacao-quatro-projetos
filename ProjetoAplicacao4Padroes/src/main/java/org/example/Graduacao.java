package org.example;

public class Graduacao implements Escolaridade {

    private static Graduacao instance;

    private Graduacao() {}

    public static Graduacao getInstance() {
        if (instance == null) {
            instance = new Graduacao();
        }
        return instance;
    }

    public float percentualAumento() {
        return 0.1f;
    }

}
