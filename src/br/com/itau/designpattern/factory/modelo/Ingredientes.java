package br.com.itau.designpattern.factory.modelo;


public class Ingredientes {

    private String name;

    private Ingredientes() {
    }

    protected Ingredientes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        return name + '\'';

    }

}
