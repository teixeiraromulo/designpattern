package br.com.itau.designpattern.factory.modelo;

public class Bordas {
    private String tipoBorda;

    private Bordas() {
    }

    protected Bordas(String tipoBorda) {
        this.tipoBorda = tipoBorda;
    }


    public String getName() {
        return tipoBorda;
    }


    @Override
    public String toString() {

        return tipoBorda + '\'';

    }
}
