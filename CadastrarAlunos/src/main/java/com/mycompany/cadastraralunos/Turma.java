/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastraralunos;

/**
 *
 * @author Root
 */
public class Turma {
    private String mat;
    private int nSala;
    private Alunos aluno;
    private int qntAluno;
    

    public Turma (String materia, int NumSala, Alunos aluno, int qntAlunos) {       
        this.mat = materia;
        this.nSala = NumSala;
        this.aluno = aluno;
        this.qntAluno = qntAlunos;
        
    }
}
