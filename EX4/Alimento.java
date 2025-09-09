package com.mycompany.ex4;


public class Alimento {
    private String nome;
    private String tipo;
    private int calorias;
    
    public Alimento() {}
    
    public Alimento(String nome, String tipo, int calorias) {
        this.nome = nome;
        this.tipo = tipo;
        this.calorias = calorias;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getCalorias() {
        return calorias;
    }
    
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    
    public void exibirInfoNutricional() {
        System.out.println("Informação Nutricional de " + nome + ":");
        System.out.println("Tipo: " + tipo);
        System.out.println("Calorias: " + calorias + " kcal por porção");
    }
    
    public void servir() {
        System.out.println("Servindo " + nome + " em uma tigela");
    }
    
    public void consumir() {
        System.out.println("Consumindo " + nome + " - Delicioso!");
    }
    
    @Override
    public String toString() {
        return "Alimento{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", calorias=" + calorias +
                '}';
    }
}