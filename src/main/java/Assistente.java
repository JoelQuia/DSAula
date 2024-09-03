/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristhian
 */
public class Assistente {
    
    private final String nome;
    private final String matricula;

    // Construtor
    public Assistente(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    // Método para imprimir informações
    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
    
}

    
}
