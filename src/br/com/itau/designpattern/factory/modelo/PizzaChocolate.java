package br.com.itau.designpattern.factory.modelo;

import java.util.List;

public class PizzaChocolate extends Pizza {
    protected PizzaChocolate() {
        this.ingredientes = List.of(
                new Ingredientes("Chocolate"),
                new Ingredientes("Creme de Leite"),
                new Ingredientes("Raspas de Chocolate")
        );

    }


}
