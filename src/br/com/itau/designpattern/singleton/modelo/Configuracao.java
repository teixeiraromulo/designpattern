package br.com.itau.designpattern.singleton.modelo;

import java.util.Objects;

public class Configuracao {

    private static Configuracao instance;

    private Configuracao() {
    }

    public static Configuracao getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Configuracao();
        }
        return instance;
    }
}