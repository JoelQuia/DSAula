/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public abstract class Ingresso {
    
    
protected double valor;
 
    public Ingresso(double valor) {
        this.valor = valor;
    }
 
    public double getValor() {
        return valor;
    }
 
    public abstract void imprimirTipo();
}
        