/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrarpacientes;

/**
 *
 * @author Root
 */
public class Sintomas {
    public boolean dorCabeca;
    public double temperatura;
    public String pressao;
    public  String Sintoma;
    public boolean cadastrado;
    
    public Sintomas(boolean dorCabec, double temp, String press, String sint){
        this.dorCabeca = dorCabec;
        this.temperatura = temp;
        this.pressao = press;
        this.Sintoma = sint;
        this.cadastrado = true;
    }
    
    public String getSintomas(){
        String retorno = "Dor de cabeça: "+ dorCabeca+ ", temperatura: "+  temperatura + ", O paciente tem: "+ Sintoma;
        return retorno;
    }
}
