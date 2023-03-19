/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastraradvogados;
/**
 *
 * @author Root
 */
public class Advogado {  
    
    public String nome;
    public int idade;
    private int nOAB;
    private String especialidade;
    private String escritorio; 
    private int casosPerdidos;
    private int casosGanhos;
    
    public Advogado(String nom, int idad) {
        this.nome = nom;
        this.idade = idad;
    }

    public void definir(int OAB, String escrit, String espec, int ganhos, int perdidos) {
        this.nOAB = OAB;
        this.escritorio = escrit;
        this.especialidade = espec;
        this.casosGanhos = ganhos;
        this.casosPerdidos = perdidos;
    }
    
    public void info(){
        System.out.println("Nome = " + nome);
        System.out.println("Número OAB = " + nOAB);
        System.out.println("Escritorio = " + escritorio);
        System.out.println("Idade = " + idade);
        System.out.println("Especialidade = " + especialidade);
        System.out.println("Casos perdidos = "+casosPerdidos);
        System.out.println("Casos ganhos = "+casosGanhos);
    }
    
}
