/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastraralunos;

/**
 *
 * @author Root
 */
public class Alunos {
    private String nome;
    private int idade;
    private double media;
    private boolean reprovado;
    private boolean inscrito = false;
    private int nSala;
    

    public Alunos(String nom, int idad) {
        this.nome = nom;
        this.idade = idad;
    }

    public void definir(boolean reprov, double med, int sala, boolean inscr) {
        this.reprovado = reprov;
        this.media = med;
        this.nSala = sala;
        this.inscrito = inscr;
    }
    public boolean getIncrito(){
        return this.inscrito;
    }
    }
}
