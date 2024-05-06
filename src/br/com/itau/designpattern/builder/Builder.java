package br.com.itau.designpattern.builder;

import br.com.itau.designpattern.builder.modelo.Endereco;

public class Builder {
    public static void main(String[] args) {
        Endereco build = new Endereco.enderecoBuilder()
                .cep(02461000)
                .rua("rua copacabana")
                .cidade("sao paulo")
                .build();
        System.out.println(build);


    }

}
