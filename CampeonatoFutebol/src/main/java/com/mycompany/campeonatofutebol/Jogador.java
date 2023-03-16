/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatofutebol;

/**
 *
 * @author Root
 */
public class Jogador {  
        private String nome;
        private String time;
        private String status;
        private double altura;
        private double peso;

        public void remover(String nome, String time, String titularReserva, double altura, double peso) {
            this.nome = null;
            this.time = null;
            this.status = null;
            this.altura = 0;
            this.peso = 0;
        }

        public void editar(String nome, String time, String titularReserva, double altura, double peso) {
            this.nome = nome;
            this.time = time;
            this.status = titularReserva;
            this.altura = altura;
            this.peso = peso;
        }

        public void informacoes() {
            System.out.println("nome: " + nome);
            System.out.println("time: " + time);
            System.out.println("status: " + status);
            System.out.println("altura: " + altura);
            System.out.println("peso: " + peso);
            System.out.println("\n");
        }

        public void adicionar(String nome, String time, String titularReserva, double altura, double peso) {
            this.nome = nome;
            this.time = time;
            this.status = titularReserva;
            this.altura = altura;
            this.peso = peso;
        }

        public String Nomes() {
            return nome;
        }
    
}
