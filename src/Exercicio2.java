import java.util.Scanner;

public class Exercicio2 {
    //2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    public static void main(String[] args) {
        Scanner ler  = new Scanner(System.in);

        int number;

        System.out.println("Infome um numero para saber se seu numero é impar, par, positivo ou negativo.");
        number = ler.nextInt();

        if (number %2 == 0){
            System.out.println("Seu numero é par");
        }else if (number %2 == 1){
            System.out.println("Seu numero é impar");
        }

        if (number < 0){
            System.out.println("Seu numero é negativo");
        }else if (number > 0 ){
            System.out.println("Seu numero é positivo");
        }else{
            System.out.println("O numero é zero");
        }

    }
}
