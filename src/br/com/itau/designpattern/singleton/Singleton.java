package br.com.itau.designpattern.singleton;

import br.com.itau.designpattern.singleton.modelo.Configuracao;

public class Singleton {
    public static void main(String[] args) {
        var configuracao = Configuracao.getInstance();
        var configuracao1 = Configuracao.getInstance();
        System.out.println(configuracao);
        System.out.println(configuracao1);
    }
}
