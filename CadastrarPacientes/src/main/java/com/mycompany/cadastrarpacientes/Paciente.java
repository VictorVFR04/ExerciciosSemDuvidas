/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrarpacientes;

/**
 *
 * @author Root
 */
public class Paciente {
    private String nome;
    private String sexo;
    private int idade;   
    public Sintomas sintoma;
    private String convenio; 

    
    
    public void setPaciente(String nom, int idad, String sex, String conv){
        this.nome = nom;
        this.idade = idad;
        this.sexo = sex;
        this.convenio = conv;
    }
    
    public void setSintoma(Sintomas sint){
        this.sintoma = sint;
    }
}
