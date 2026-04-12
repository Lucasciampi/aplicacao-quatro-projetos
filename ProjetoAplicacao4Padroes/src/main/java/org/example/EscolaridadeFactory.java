package org.example;

public class EscolaridadeFactory {

    private static EscolaridadeFactory instance;

    private EscolaridadeFactory() {
    }

    public static EscolaridadeFactory getInstance() {
        if (instance == null) {
            instance = new EscolaridadeFactory();
        }
        return instance;
    }

    public Escolaridade obterEscolaridade(String escolaridade){

        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("org.example." + escolaridade);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo de Escolaridade não encontrada.");
        }
        if (!(objeto instanceof Escolaridade)) {
            throw new IllegalArgumentException("Escolaridade inválida.");
        }
        return (Escolaridade) objeto;
    }

}
