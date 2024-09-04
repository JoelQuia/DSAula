/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
class Inferior extends Vip {
    public Inferior() {
        super();
        this.valor = 100.0; // Valor específico para camarote inferior
    }
    @Override
    public void imprimirTipo() {
        System.out.println("Ingresso VIP - Camarote Inferior. Valor: R$ " + getValor());
    }
}
