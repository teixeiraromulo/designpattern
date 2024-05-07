package br.com.itau.designpattern.factory.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected List<Ingredientes> ingredientes;
    protected List<Massas> massas;
    protected List<Bordas> bordas;

    protected Pizza() {
        this.ingredientes = new ArrayList<>();
        this.massas = new ArrayList<>();
        this.bordas = new ArrayList<>();
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public List<Massas> getMassas() {
        return massas;
    }


    public List<Bordas> getBordas() {
        return bordas;
    }

    @Override
    public String toString() {
        return "Pizza" + massas + bordas +
                ", ingredientes da receita: " + ingredientes;
    }
}

