package org.example;

public class CategoriaFactory {

    private static CategoriaFactory instance;

    private CategoriaFactory() {}

    public static CategoriaFactory getInstance(){
        if (instance == null){
            instance = new CategoriaFactory();
        }
        return instance;
    }

    public Categoria obterCategoria(String categoria) {

        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("org.example.Categoria" + categoria);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo de Categoria não encontrada.");
        }
        if (!(objeto instanceof Categoria)) {
            throw new IllegalArgumentException("Categoria inválida.");
        }
        return (Categoria) objeto;
    }

}
