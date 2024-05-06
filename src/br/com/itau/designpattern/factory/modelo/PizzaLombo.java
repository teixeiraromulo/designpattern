package br.com.itau.designpattern.factory.modelo;

import java.util.List;

public class PizzaLombo extends Pizza {

    protected PizzaLombo() {
        this.ingredientes = List.of(
                new Ingredientes("Mussarela"),
                new Ingredientes("Lombinho"),
                new Ingredientes("Manjericão")
        );
    }


}
