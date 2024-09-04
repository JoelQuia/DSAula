
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main (String []args){
        
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Digite 1 para ingresso normal e 2 para ingresso VIP:");
        int tipoIngresso = scanner.nextInt();
        Ingresso ingresso;
 
        if (tipoIngresso == 1) {
            ingresso = new Normal();
        } else if (tipoIngresso == 2) {
            System.out.println("Digite 1 para camarote superior e 2 para camarote inferior:");
            int tipoCamarote = scanner.nextInt();
 
            if (tipoCamarote == 1) {
                ingresso = new Superior();
            } else if (tipoCamarote == 2) {
                ingresso = new Inferior();
            } else {
                System.out.println("Opção inválida para camarote.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Opção inválida para tipo de ingresso.");
            scanner.close();
            return;
        }
 
        ingresso.imprimirTipo();
        scanner.close();
        
    }
    
}
