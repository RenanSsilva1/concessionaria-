package org.example;

import org.example.marcas.honda.moto.titan.Titan160;

public class Main {
    public static void main(String[] args) {
        Titan160 titan160 = new Titan160();
        titan160.exibirEspecificacoes("Preto",9,35,120,2024);
        System.out.println(titan160);
    }
}