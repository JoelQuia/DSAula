
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Imovel {
    public static void main (String []args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 1 para imovél novo e 2 para imovél velho:");
        int escolha = scanner.nextInt();
    
    Imovel imovel;
        if (escolha ==1){
                imovel = new Novo (Valor);
        }else if(escolha ==2){
            imovel = new Velho (Valor);
        }else{
        System.out.println("Opção inválida");
        scanner.close();
        return;
        }
        
        double valorFinal = imovel.calcularValor();
        System.out.println("O valor do Imovél é" + valorFinal);
        
        scanner.close();
    }
    
}
