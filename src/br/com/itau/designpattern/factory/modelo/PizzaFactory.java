package br.com.itau.designpattern.factory.modelo;

public class PizzaFactory {

    public PizzaFactory() {
    }

    public static Pizza getPizza(boolean salgado) {
        if (salgado) {
            return new PizzaLombo();
        } else {
            return new PizzaChocolate();
        }
    }

}
