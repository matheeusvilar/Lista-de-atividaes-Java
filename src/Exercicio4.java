import java.util.Scanner;

public class Exercicio4 {
    //4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
    public static void main(String[] args) {
        int valorA;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite um numero");
        valorA = valor.nextInt();
        System.out.println("Seu antecessor e "+ (valorA - 1));
        System.out.println("E seu sucessor e " +  (valorA + 1));
    }
}
