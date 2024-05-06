package br.com.itau.designpattern.factory.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected List<Ingredientes> ingredientes;

    protected Pizza() {
        this.ingredientes = new ArrayList<>();
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return "Pizza(" +
                "ingredientes=" + ingredientes +
                ')';
    }
}

