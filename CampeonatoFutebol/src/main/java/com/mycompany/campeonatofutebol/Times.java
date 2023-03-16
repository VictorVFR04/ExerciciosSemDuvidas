/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatofutebol;

/**
 *
 * @author Root
 */
public class Times {
    
    public String Time;
    public Jogador jogador;
    public int vitoria;
    public int derrota;
    public String tecnico;
    
    public void team(String nome, Jogador jogador, int vitoria, int derrota, String tecnico) {
        this.Time = nome;
        this.jogador = jogador;
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.tecnico = tecnico;
    }
    public void info(){
    System.out.println("Time: " + Time);
    System.out.println("Jogador: " + jogador.Nomes());
    System.out.println("Jogos ganhos: " + vitoria);
    System.out.println("Jogos perdidos: " + derrota);
    System.out.println("Tecnico: " + tecnico);
}
}
