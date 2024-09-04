/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
class Normal extends Ingresso {
    public Normal() {
        super(50.0);
    }
 
    @Override
    public void imprimirTipo() {
        System.out.println("Ingresso Normal. Valor: R$ " + getValor());
    }
}