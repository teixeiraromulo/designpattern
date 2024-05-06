package br.com.itau.designpattern.builder.modelo;

public class Endereco {
    private String rua;
    private int cep;
    private String cidade;

    private Endereco(String rua, int cep, String cidade) {
        this.rua = rua;
        this.cep = cep;
        this.cidade = cidade;
    }
        @Override
        public String toString() {
            return "enderecoBuilder{" +
                    "rua='" + rua + '\'' +
                    ", cep=" + cep +
                    ", cidade='" + cidade + '\'' +
                    '}';
        }

    public static class enderecoBuilder {
        private String rua;
        private int cep;
        private String cidade;

        public enderecoBuilder rua(String rua) {
            this.rua = rua;
            return this;
        }

        public enderecoBuilder cep(int cep) {
            this.cep = cep;
            return this;
        }

        public enderecoBuilder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public Endereco build() {
            return new Endereco(rua, cep, cidade);
        }

    }


}
