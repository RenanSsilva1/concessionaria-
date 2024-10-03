package org.example.marcas.honda.moto.titan;

import org.example.marcas.Especificacoes;

public class Titan160 {
    private Especificacoes especificacoes;

    public Titan160() {
        especificacoes = new Especificacoes();
    }
    public void exibirEspecificacoes(String cor, double potencia, double consumo, int velocidadeMaxima ,int ano ){
       especificacoes.setCor(cor);
       especificacoes.setPotencia(potencia);
       especificacoes.setConsumo(consumo);
       especificacoes.setVelocidadeMaxima(velocidadeMaxima);
       especificacoes.setAno(ano);

    }
    @Override
    public String toString() {
        return especificacoes.toString();
    }
}
