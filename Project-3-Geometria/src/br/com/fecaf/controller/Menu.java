package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    public void executarMenu(){
        boolean exit = false;

        while(!exit) {
            System.out.println("/*********************/");
            System.out.println("/***** Geometria *****/");
            System.out.println("/*********************/");
            System.out.println("/**** 1 - Circulo ****/");
            System.out.println("/*** 2 - Retangulo ***/");
            System.out.println("/*** 3 - Triângulo ***/");
            System.out.println("/****** 4 - Sair *****/");
            System.out.println("/*********************/");
            System.out.println("Informe a opção desejada: ");

            int optionUser = scanner.nextInt();

            switch(optionUser){
                case 1:
                    boolean exitCirculo = false;
                    boolean validaCadastro = false;
                    Circulo circulo = new Circulo();

                    while (!exitCirculo){

                    System.out.println("/********************/");
                    System.out.println("/***** Circulo ******/");
                    System.out.println("/********************/");
                    System.out.println("1 - Cadastrar Circulo ");
                    System.out.println("2 - Calcular Area ");
                    System.out.println("3 - Calcular Perimetro ");
                    System.out.println("4 - Sair ");
                    System.out.println("/********************/");

                    System.out.println("Escolha uma opção: ");

                    int optionCirculo = scanner.nextInt();


                    switch (optionCirculo){
                        case 1:
                            System.out.println("Cadastrando Circulo...");
                            validaCadastro= circulo.cadastrarCirculo();
                            break;
                        case 2:
                            if(validaCadastro) {
                                System.out.println(circulo.raio);
                                System.out.println("Calculando Área");
                                circulo.calcularArea();
                            }else {
                                System.out.println("Cadastre um círculo...");
                            }
                            break;
                        case 3:
                            if(validaCadastro) {
                                System.out.println("Calculando Perímetro");
                                circulo.calcularPerimetro();
                            }else {
                                System.out.println("Cadastre um círculo...");
                            }

                            break;
                        case 4:
                            System.out.println("Voltando pro Menu");
                            exitCirculo = true;
                        default:
                            System.out.println("Opção Inválida");

                    }
                    }
                    break;
                case 2:
                    boolean exitRetangulo = false;
                    Retangulo retangulo = new Retangulo();
                    boolean validaRetangulo = false;

                    while (!exitRetangulo) {

                        System.out.println("/********************/");
                        System.out.println("/**** Retângulo ****/");
                        System.out.println("/********************/");
                        System.out.println("1 - Cadastrar Retângulo ");
                        System.out.println("2 - Calcular Area ");
                        System.out.println("3 - Calcular Perimetro ");
                        System.out.println("4 - Validar Quadrado ");
                        System.out.println("5 - Sair ");
                        System.out.println("/********************/");

                        System.out.println("Escolha uma opção: ");

                        int optionRetangulo = scanner.nextInt();


                        switch (optionRetangulo){
                            case 1:
                                System.out.println("Cadastrando Retângulo");
                                validaRetangulo =  retangulo.cadastrarRetangulo();

                                break;

                            case 2:
                                if (validaRetangulo) {
                                    System.out.println("Calculando a Area");
                                    retangulo.calcularArea();
                                    } else {
                                    System.out.println("Cadastre um Retângulo");

                                }
                                break;

                            case 3:
                                if (validaRetangulo) {
                                    System.out.println("Calculando o perímetro");
                                    retangulo.calcularPerimetro();
                                }else {
                                    System.out.println("Cadastre um retângulo");
                                }

                                break;

                            case 4:
                                System.out.println("/** Definindo Quadrado **/");
                                    if(validaRetangulo){
                                        retangulo.validarQuadrado();
                                    }


                            case 5:
                                System.out.println("Saindo...");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida..");
                        }

                    }

                    break;
                case 3:
                    boolean exitTriangulo = false;
                    Triangulo triangulo = new Triangulo();
                    boolean validaTriangulo = false;

                    while (!exitTriangulo){
                        System.out.println("/********************/");
                        System.out.println("/**** Triangulo ****/");
                        System.out.println("/********************/");
                        System.out.println("1 - Cadastrar Triangulo ");
                        System.out.println("2 - Calcular Area ");
                        System.out.println("3 - Calcular Perimetro ");
                        System.out.println("4 - Tipo do triangulo ");
                        System.out.println("5 - Vallidar se triângulo é retângulo ");
                        System.out.println("6 - Sair ");
                        System.out.println("/********************/");

                    int optionTriangulo = scanner.nextInt();

                    switch (optionTriangulo) {
                        case 1:
                            System.out.println("Cadastrar Triangulo");
                            validaTriangulo = triangulo.cadastrarTriangulo();
                            break;

                        case 2:
                            if (validaTriangulo) {
                                System.out.println("Calculando Area");
                                triangulo.calcularArea();
                            }
                            break;

                        case 3:
                            if (validaTriangulo) {
                                System.out.println("Calculando Perimetro");
                                triangulo.calcularPerimetro();
                            }
                            break;

                        case 4:
                            if (validaTriangulo) {
                                System.out.println("O tipo do Triangulo é: ");
                                triangulo.definirTipo();
                            }
                            break;


                        case 5:
                            if (validaTriangulo){
                            System.out.println("Calculando...");
                            triangulo.validarRetangulo();
                        }break;

                        case 6:
                            System.out.println("Saindo...");
                            exitTriangulo = true;
                            break;
                        default:
                            System.out.println("Escolha uma opção válida..");


                    }
                    }
                    break;

                case 4:
                    System.out.println("Feature in Development");
                    break;
                default:
                    System.out.println("Opção inválida...");
            }
        }
    }
}
