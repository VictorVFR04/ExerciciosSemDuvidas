/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrarbicicletas;

/**
 *
 * @author Root
 */
public class Bicicletas {
    
    public String marca;
    public String resistencia;
    public String tipo;
    private double valor;
    private int velocidade;
    private String cor;
    private int marchas;
    
    public void setVel (int vel, int marcha) {
        velocidade = vel;
        marchas = marcha;
    }
    
    public void setCorValor (String ncor, double preco) {
        cor = ncor;
        valor = preco;
    }
    
    public String getGeral () {
        return "Velocidade: " + velocidade + " Marchas: " + marchas + " Cor: " + cor + " Preço: " + valor;
    }
    
    public Bicicletas (String marc, String resist, String tip) {
        marca = marc;
        resistencia = resist;
        tipo = tip;
    }
    
    public String getInfo () {
        return "Marca: " + marca + " Resistencia: " + resistencia + " tipo: " + tipo;
    }
}
