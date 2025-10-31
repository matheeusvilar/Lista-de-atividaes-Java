import java.sql.SQLOutput;

public class Exercicio1 {
    //1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
    public static void main(String[] args) {

         int A = 10;
         int B = 100;
         int C = 70;

         int soma = A + B;
         if(soma < C){
             System.out.println("O Resultado da soma de A + B é " + soma + " que é menor que C, pois o valor de C é " + C) ;
         }else {
             System.out.println("a soma de A + B "+ soma);
         }

    }


}
