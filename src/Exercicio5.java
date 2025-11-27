import java.util.Scanner;

public class Exercicio5 {
    //5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
    //
    //usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

    public static void main(String[] args) {

        Scanner salario = new Scanner(System.in);
        double salarioMinimo = 1293.20;
        double salarioUsuario;

        System.out.println("Informe seu salario");
        salarioUsuario = salario.nextDouble();

        double quantidade = salarioUsuario / salarioMinimo;

        System.out.printf("Você recebe aproximadamente %.2f salários mínimos.%n", quantidade);

    }
}
