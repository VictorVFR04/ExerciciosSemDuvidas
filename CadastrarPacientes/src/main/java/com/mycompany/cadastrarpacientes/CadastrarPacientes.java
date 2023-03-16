/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrarpacientes;

/**
 *
 * @author Root
 */
public class CadastrarPacientes {

       public static void main(String[] args) {
        Sintomas sintoma1 = new Sintomas(false,35.6,"18/7","cancer");
        Sintomas sintoma2 = new Sintomas(false,35.2,"19/2","infarto");
        Sintomas sintoma3 = new Sintomas(true,38.5,"18/1","placebo");
        Paciente paciente1 = new Paciente();
        paciente1.setPaciente("Juan", 9, "Homem", "Sus");
        paciente1.setSintoma(sintoma1);
        Paciente paciente2 = new Paciente();
        paciente2.setPaciente("Marcos", 43, "Homem", "SUS");
        paciente2.setSintoma(sintoma2);
        Paciente paciente3 = new Paciente();
        paciente3.setPaciente("Felipe", 76, "Mulher", "UNIMED");
        paciente3.setSintoma(sintoma3);
        Paciente paciente4 = new Paciente();
        paciente4.setPaciente("Andre", 54, "Mulher", "SUS");
        paciente4.setSintoma(sintoma1);
        Paciente paciente5 = new Paciente();
        paciente5.setPaciente("Joao", 12, "Homem", "UNIMED");
        paciente5.setSintoma(sintoma2);
        Paciente paciente6 = new Paciente();
        paciente6.setPaciente("Don", 32, "Mulher", "SUS");
        paciente6.setSintoma(sintoma3);
    }
}
