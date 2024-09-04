/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
class Superior extends Vip {
    public Superior() {
        super();
        this.valor = 150.0; // Valor específico para camarote superior
    }
 
    @Override
    public void imprimirTipo() {
        System.out.println("Ingresso VIP - Camarote Superior. Valor: R$ " + getValor());
    }
}