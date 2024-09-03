/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Velho extends TipoImovel {
    
    private static final double Valor = 1000.00;
    private static final double Desconto = 0.2;
    
    @Override
    public double calcularValor(){
        return Valor * (1- Desconto);
    }
    
}
