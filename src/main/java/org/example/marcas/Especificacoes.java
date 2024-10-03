package org.example.marcas;

public class Especificacoes {

    private String cor;
    private double potencia;
    private double consumo;
    private int velocidadeMaxima;
    private int ano;

    public Especificacoes() {

    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return
                "Cor: {" + cor + "}" +
                ", Potencia: {" + potencia + " cv" + "}" +
                ", Consumo: {" + consumo + " km/ l" + "}" +
                ", VelocidadeMaxima: {" + velocidadeMaxima + " km/ h" + "}" +
                ", Ano: {" + ano + "}" ;
    }
}



