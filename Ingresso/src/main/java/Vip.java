/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
class Vip extends Ingresso {
    public Vip() {
        super(100.0); // Valor base para VIP
    }
 
    @Override
    public void imprimirTipo() {
        System.out.println("Ingresso VIP. Valor base: R$ " + getValor());
    }
}