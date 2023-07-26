package com.example;

import java.util.Locale;
import java.util.Scanner;

import com.example.entities.Produtos;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("----------------------------!Exercício 2----------------------------!");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name;
        double price;
        int qtdStock;
        int qtd;
        
        System.out.println("Enter the product data:");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("\nPrice: ");
        price = sc.nextDouble();
        System.out.print("\nQuantity in stock: ");
        qtdStock = sc.nextInt();
        
        Produtos p1 = new Produtos(name, price, qtdStock);
        
        System.out.printf("\nProduct data %s", p1.toString());
        
        System.out.print("\nEnter the qtd of products to enter stock: ");
        qtd = sc.nextInt();
        p1.addProducts(qtd);
        System.out.printf("\nUpdated data: %s", p1.toString());
        
        System.out.print("\nEnter the qtd of products to remove from stock: ");
        qtd = sc.nextInt();
        p1.removeProducts(qtd);
        System.out.printf("\nUpdated data: %s", p1.toString());
        
        sc.close();
        
    }
}
