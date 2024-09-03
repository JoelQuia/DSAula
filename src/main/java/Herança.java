/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristhian
 */
public class Herança {
    
    public static void main(String[] args) {
        Administrativo assistente = new Administrativo("Joel", "1234");
        Tecnico tecnico = new Tecnico("Antony", "5678");

        System.out.println("Assistente Administrativo:");
        assistente.imprimirInformacoes();
        
        System.out.println("\nTécnico:");
        tecnico.imprimirInformacoes();
    
}

    
}
