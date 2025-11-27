import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

        Scanner valor = new Scanner(System.in);
        System.out.println("Informe um numero");
        double valor1 = valor.nextDouble();
        double reajuste = valor1 +(valor1 * 5 / 100);

        System.out.println("Seu valor com reajuste de 5% é " + reajuste );
    }
}
