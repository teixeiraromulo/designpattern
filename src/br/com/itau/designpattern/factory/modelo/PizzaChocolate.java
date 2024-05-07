package br.com.itau.designpattern.factory.modelo;

import java.util.List;

public class PizzaChocolate extends Pizza {
    protected PizzaChocolate() {
        this.massas = List.of(
                new Massas("Massa Grossa")
        );
        this.bordas = List.of(
          new Bordas("Borda de doce de Leite")
        );
        this.ingredientes = List.of(
                new Ingredientes("Leite Ninho"),
                new Ingredientes("Leite Condensado"),
                new Ingredientes("Raspas de Chocolate Amargo")
        );

    }


}
