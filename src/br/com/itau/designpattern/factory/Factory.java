package br.com.itau.designpattern.factory;

import br.com.itau.designpattern.factory.modelo.PizzaFactory;

public class Factory {

    public static void main(String[] args) {

        var pizzaSalgada = PizzaFactory.getPizza(true);
        var pizzaDoce = PizzaFactory.getPizza(false);


        System.out.println(pizzaSalgada);
        System.out.println(pizzaDoce);

    }


}
