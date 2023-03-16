/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrarcerveja;

/**
 *
 * @author Root
 */
public class Cerveja {
    
   public String marca;
    public String recipiente;
    public double valor;
    public String quantAlcool;
    private String qualidade;
    private int codigo;

    public Cerveja(int aCodigo) {
        this.codigo = aCodigo;
    }

    public void info(String marc, String recip, double val, String quantAlcool, String qualid) {
        this.marca = marc;
        this.recipiente = recip;
        this.valor = val;
        this.quantAlcool = quantAlcool;
        this.qualidade = qualid;
    }

    public int Cod() {
        return this.codigo;
    }

    public void cervejas() {
        System.out.println("Marca: " + marca);
        System.out.println("Recipiente: " + recipiente);
        System.out.println("Valor: " + valor);
        System.out.println("Quantidade de Alcool: " + quantAlcool);
        System.out.println("Qualidade: " + qualidade);
        System.out.println("Código: " + codigo);

    }
    
}
