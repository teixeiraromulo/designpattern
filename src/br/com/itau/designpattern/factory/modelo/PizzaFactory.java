package br.com.itau.designpattern.factory.modelo;

public class PizzaFactory {

    public PizzaFactory() {
    }

    public static Pizza getPizza(String tipoPizza) {
        if (tipoPizza.equalsIgnoreCase("Salgado")) {
            return new PizzaLombo();
        } else if (tipoPizza.equalsIgnoreCase("Doce")) {
            return new PizzaChocolate();
        }
        return null;
    }

}
