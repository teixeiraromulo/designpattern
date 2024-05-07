package br.com.itau.designpattern.factory.modelo;

import java.util.List;

public class PizzaLombo extends Pizza {

    protected PizzaLombo() {
        this.massas = List.of(
                new Massas("Massa Fina")
        );

        this.bordas = List.of(
                new Bordas("Borda de Catupiry")
        );

        this.ingredientes = List.of(
                new Ingredientes("Mussarela"),
                new Ingredientes("Lombinho"),
                new Ingredientes("Manjericão")
        );
    }
}
