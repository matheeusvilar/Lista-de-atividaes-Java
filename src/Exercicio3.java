import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio3 {
    //3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
    //
    //caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
    //
    //imprimir seu valor na tela.
    public static void main(String[] args) {
        Scanner valor1 = new Scanner(System.in);
        Scanner valor2 = new Scanner(System.in);

        int valorA;
        int valorB;
        int valorC;

        System.out.println("Digite um numero");
        valorA = valor1.nextInt();

        System.out.println("Digite outro numero");
        valorB = valor2.nextInt();

        if (valorA == valorB){
            valorC = valorA + valorB;
            System.out.println("Resultado da soma " + valorC);
        } else if (valorA != valorB) {
            valorC = valorA * valorB;
            System.out.println("Resultado da multiplicação " + valorC);
        }
    }
}
