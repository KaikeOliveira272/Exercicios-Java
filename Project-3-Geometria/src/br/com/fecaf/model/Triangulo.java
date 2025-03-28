package br.com.fecaf.model;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Triangulo {
    public double base, altura, lado2, lado3, area, perimetro;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/***********************/");
        System.out.println("/* Cadastrar triangulo  */");
        System.out.println("/***********************/");
        System.out.print("Informe a base: ");
        base = scanner.nextDouble();
        System.out.println("/***********************/");
        System.out.println("Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("Informe o lado 3: ");
        lado3 = scanner.nextDouble();
        System.out.println("Informe a altura: ");
        altura = scanner.nextDouble();

        return true;
    }

    public void calcularArea() {
        System.out.println("/* Calculando Area");
        area = (base * altura) / 2;
        System.out.println("A area é: " + area);

    }

    public void calcularPerimetro() {
        System.out.println("/*  Calculando Perimetro  */");
        perimetro = base + lado2 + lado3;
        System.out.println("O perimetro é: " + perimetro);

    }


    /** Definir tipo de Triangulo*/

    /**
     * Equilatero - Escaleno - Isosceles
     */

    public void definirTipo() {
        System.out.println("/* Definindo Tipo Triângulo*/");

        if (base == lado2 && base == lado3) {
            System.out.println("Esse triângulo é um Equilátero...");
        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("Esse triângulo é um Escaleno...");
        } else {
            System.out.println("Esse triângulo é um Isósceles...");
        }
    }

    public void validarRetangulo() {
        System.out.println("/* Definindo Triângulo Retângulo */");

        // Inserir as variáveis que serão utilizadas em um Array
        double[] lados = {base, lado2, lado3};
        // Utilizar Arrays.sort para ordenar o array em ordem crescente
        Arrays.sort(lados);

        // Com o array em ordem crescente, o maior lado (último índice [2]) será a hipotenusa
        double cateto1 = lados[0];
        double cateto2 = lados[1];
        double hipotenusa = lados[2];

        // Aplicação da equivalência (==) do Teorema de Pitágoras
        if (Math.pow(cateto1, 2) + Math.pow(cateto2, 2) == Math.pow(hipotenusa, 2)) {
            System.out.println("Este triângulo é um triângulo retângulo.");

            // Lógica para verificar a divisibilidade de 3, 4 ou 5
            double razaoA = lados[0] / 3;
            double razaoB = lados[1] / 4;
            double razaoC = lados[2] / 5;

            // Aqui fazemos uma verificação se o resultado de divisão entre os 3 respectivamente por 3, 4 ou 5 serão iguais ( ==), assim conseguimos verificar a proporcionalidade dos valores e definir se é um triângulo 3-4-5
            if (razaoA == razaoB && razaoB == razaoC) {
                System.out.println("Este triângulo também é equivalente ao 3-4-5 (múltiplo da proporção).");
            } else {
                System.out.println("Este triângulo não segue a proporção 3-4-5.");
            }
        } else {
            System.out.println("Este triângulo não é um triângulo retângulo.");
        }
    }
}