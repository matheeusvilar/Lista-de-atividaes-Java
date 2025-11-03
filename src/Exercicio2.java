import java.util.Scanner;

public class Exercicio2 {
    //2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    public static void main(String[] args) {
        Scanner ler  = new Scanner(System.in);

        int n;

        System.out.println("Infome um numero para saber se seu numero é impar, par, positivo ou negativo.");
        n = ler.nextInt();

        if (n %2 == 0){
            System.out.println("Seu numero é par");
        }else if (n %2 == 1){
            System.out.println("Seu numero é impar");
        }else if (n < -1){
            System.out.println("Seu numero é negativo");
        }else if (n > 1){
            System.out.println("Seu numero é positvo");
        }

    }
}
