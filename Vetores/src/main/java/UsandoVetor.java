/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristhian
 */
import java.util.Scanner;

public class UsandoVetor {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        double soma = 0;

        // Entrada de dados
        System.out.println("Digite 10 valores inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        // Identificar maior e menor valor
        double maior = numeros[0];
        double menor = numeros[0];
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Exibir a soma dos valores
        System.out.println("\nSoma de todos os valores: " + soma);

        // Exibir maior e menor valor
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        // Exibir todos os valores indicando o maior e o menor
        System.out.println("\nValores inseridos:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == maior) {
                System.out.print(" (maior)");
            }
            if (numeros[i] == menor) {
                System.out.print(" (menor)");
            }
            System.out.println();
        }

        scanner.close();
    }
    
}
