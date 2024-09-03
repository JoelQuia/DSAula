/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author Cristhian
 */
public class Pobre extends ClasseSocial {
    public Pobre(String nome) {
        super(nome);
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando!");
    }
}