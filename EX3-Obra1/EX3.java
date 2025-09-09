package com.mycompany.ex3.obra1;


public class VikMuniz {
    public static void main(String[] args) {
        Retrato retrato = new Retrato("Che Guevara", 39, "Argentino");
        FeijaoEnlatado feijao = new FeijaoEnlatado("Tradicional", "Quero", 400);
        Boina boina = new Boina("Preta", "Vermelha", "Lã");
        
        retrato.exibir();
        feijao.comer();
        boina.vestir();
        
        System.out.println("\nDetalhes das obras:");
        System.out.println(retrato);
        System.out.println(feijao);
        System.out.println(boina);
        
        System.out.println("\n--- Recriando obra à maneira de Vik Muniz ---");
        System.out.println("Retrato do " + retrato.getPessoa() + " feito com " + 
                          feijao.getMarca() + " e usando " + boina.getMaterial());
    }
}