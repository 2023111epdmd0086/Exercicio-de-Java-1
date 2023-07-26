package com.example.entities;

public class Produtos {
    private String name;
    private double price;
    private int qtdStock;

    public Produtos(String name, double price, int qtdStock){
        this.name = name;
        this.price = price;
        this.qtdStock = qtdStock;
    }

    // Funções próprias
    public double totalValueInStock(){
        return this.qtdStock;
    }

    public void addProducts(int qtd){
        this.qtdStock += qtd;
    }

    public void removeProducts(int qtd){
        this.qtdStock -= qtd;
    }

    public String toString(){
        return this.name+", $ "+this.price+", "+this.qtdStock+" units, Total: $ "+String.format("%.2f", (this.price * this.qtdStock));
    }

}
