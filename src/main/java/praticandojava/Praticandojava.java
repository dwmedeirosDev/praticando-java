package praticandojava;

import java.util.Scanner;
import java.lang.Math;

public class Praticandojava {
    static Scanner scanner = new Scanner(System.in); // Feito o instaciamento na classe para distruibuir para todas as funções e métodos e "economizar" linha

    public static void main(String[] args) {
        String opcoes;

        // Loop principal para manter o programa rodando até o usuário escolher sair
        while (true) {
            System.out.println("Escolha as opções: ");
            System.out.println("1 - Teste de autorização");
            System.out.println("2 - Cálculo de área de um quadrado");
            System.out.println("3 - Cálculo de área de um círculo");
            System.out.println("4 - Contagem até 15");
            System.out.println("5 - Fibonacci");
            System.out.println("6 - Sair");
            opcoes = scanner.next();

            switch (opcoes) {
                case "1":
                    System.out.println("Você escolheu o teste de autorização");
                    autorizacao();
                    return;
                case "2":
                    System.out.println("Você escolheu o cálculo de área de um quadrado");
                    calculoDeAreaQuadrado();
                    return;
                case "3":
                    System.out.println("Você escolheu o cálculo de área de um círculo");
                    calculoDeAreaCirculo();
                    return;
                case "4":
                    System.out.println("Contagem de 1 até 15");
                    contagemDeNumeros();
                    return;
                case "5":
                    fibonacci();
                    return;
                case "6":
                    System.out.println("Você saiu!");
                    return;
                default:
                    System.out.println("ERRO: Digitou o número errado.");
                    break;
            }
        }
    }

    public static void autorizacao() {
        int idade;
        // Loop que continua até o usuário inserir uma idade maior ou igual a 18
        while (true) {
            System.out.println("Qual a sua idade? ");
            idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("Autorização realizada com sucesso");
                break; // Sai do loop se a idade for maior ou igual a 18
            }else {
                System.out.println("Autorização negada. Tente novamente.");

            }
        }
    }

    public static void calculoDeAreaQuadrado() {
        System.out.println("Qual o tamanho de cada lado do quadrado? ");
        int lado = scanner.nextInt();
        System.out.println("A área do quadrado é " + lado * lado + " cm²");
    }


    // Math.pow
    public static void calculoDeAreaCirculo(){
        System.out.println("Qual tamanho do diâmetro do círculo? ");
        double pi = 3.1416;
        double diametro = scanner.nextFloat();
        System.out.println("O raio do círculo é " + diametro/2);
        System.out.println("A área do círculo é " + pi * Math.pow((diametro/2), 2) + "cm²");
    }

    public static void contagemDeNumeros(){
        for(int number = 1; number <= 15; number++){
            System.out.println(number);
        }
    }

    public static void fibonacci(){
        int numA = 0;
        int numB = 1;

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        if(number > 0) {
            for (int i = 0; i < number; i++) {
                System.out.println("Sequência de Fibonacci:" + numA);
                numB = numA + numB;
                numA = numB - numA;
            }
        }
        else{
            System.out.println("Você digitou um número inválido");
        }
    }
}