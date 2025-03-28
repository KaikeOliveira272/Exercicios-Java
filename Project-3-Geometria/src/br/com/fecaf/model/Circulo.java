package br.com.fecaf.model;

import java.util.Scanner;

public class Circulo {
    // Isso e um atributo
    public double raio, area, perimetro, diametro;

    /** Instancia o Objeto Scanner */
    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarCirculo () {
        System.out.println("/**********************/");
        System.out.println("/*  Cadastro Circulo  */");
        System.out.println("/**********************/");
        System.out.println("Informe o raio: ");
        raio = scanner.nextDouble();
        System.out.println("Circulo Cadastrado com Sucesso...");
        System.out.println("/**********************************/");

        return true;

    }

    public void exibirCirculo () {
        System.out.println("/******    Informações Circulo  *******/");
        System.out.println("O raio do circulo é: " + raio);
        System.out.println("A area do Circulo é: " + area);
        System.out.println("O perimetro do Circulo é: " + perimetro);
        System.out.println("O diâmetro do Circulo é: " + diametro);
        System.out.println("/***************************************/");
    }

    public void calcularArea() {
        System.out.println("/*    Calculando Area    */");

        // Calculo da Area
        //area = 3.14159 * (raio * raio);
        //area = Math.PI * (raio * raio);
        area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area do circulo é: " + area);
    }

    public void calcularPerimetro () {
        System.out.println("/*   Calculando Perimetro   */");

        perimetro = 2 * Math.PI * raio;
        System.out.println("O perimetro do circulo é: " + perimetro);
    }











}
