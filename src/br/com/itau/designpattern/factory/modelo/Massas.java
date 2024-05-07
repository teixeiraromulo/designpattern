package br.com.itau.designpattern.factory.modelo;

public class Massas {
    private String tipoMassa;

    private Massas() {
    }

    protected Massas(String tipoMassa) {
        this.tipoMassa = tipoMassa;
    }


    public String getName() {
        return tipoMassa;
    }


    @Override
    public String toString() {

        return tipoMassa + '\'';

    }
}
