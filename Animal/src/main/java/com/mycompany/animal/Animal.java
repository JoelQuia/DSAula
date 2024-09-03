/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animal;

/**
 *
 * @author Cristhian
 */
public class Animal {
public static void main(String[] args) {
        // Criando um objeto do tipo Cachorro
        Cachorro cachorro = new Cachorro();
        cachorro.latir();    // Faz o cachorro latir
        cachorro.caminhar(); // Faz o cachorro caminhar

        // Criando um objeto do tipo Gato
        Gato gato = new Gato();
        gato.miar();         // Faz o gato miar
        gato.caminhar();     // Faz o gato caminhar
    }
    
}