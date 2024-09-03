/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

/**
 *
 * @author Cristhian
 */
public class Pessoa {

    public static void main(String[] args) {
        Rica pessoaRica = new Rica("João");
        Pobre pessoaPobre = new Pobre("Maria");
        Miseravel pessoaMiseravel = new Miseravel("José");

        System.out.println("Informações da pessoa rica:");
        pessoaRica.mostrarInfo();
        pessoaRica.fazerCompras();

        System.out.println("\nInformações da pessoa pobre:");
        pessoaPobre.mostrarInfo();
        pessoaPobre.trabalhar();

        System.out.println("\nInformações da pessoa miserável:");
        pessoaMiseravel.mostrarInfo();
        pessoaMiseravel.mendigar();
    }
}
