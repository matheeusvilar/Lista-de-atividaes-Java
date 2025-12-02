import java.util.Scanner;

public class Exercicio7 {
    // 7 - Faça um algoritmo que leia dois valores booleanos (lógicos)
    // e determine se ambos são VERDADEIRO ou FALSO.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Açaí é bom? (true/false)");
        boolean valor1 = sc.nextBoolean();

        System.out.println("Ele combina com paçoca? (true/false)");
        boolean valor2 = sc.nextBoolean();

        // Verifica se os dois são verdadeiros OU se os dois são falsos
        if ((valor1 && valor2) || (!valor1 && !valor2)) {
            System.out.println("Ambos são verdadeiros ou ambos são falsos.");
        } else {
            System.out.println("Os valores são diferentes.");
        }

        sc.close();
    }
}
