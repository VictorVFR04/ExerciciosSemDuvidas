/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastraralunos;

/**
 *
 * @author Root
 */
public class CadastrarAlunos {
    
        public static void main(String[] args) {
        Alunos aluno1 = new Alunos("Juan", 23);
        Alunos aluno2 = new Alunos("Augusto", 12);
        Alunos aluno3 = new Alunos("José", 53);

        aluno1.definir(false, 9.0, 15, false);
        aluno2.definir(false, 7.1, 15, true);
        aluno3.definir(true, 8.9, 15, true);

        if (aluno1.getIncrito()) {
            Turma turma1 = new Turma("Portugues", 34, aluno1,23);
        }
        
        if (aluno2.getIncrito()) {
            Turma turma2 = new Turma("Fisica", 32, aluno2, 45);
        }
        
        if (aluno3.getIncrito()) {
            Turma turma3 = new Turma("Quimica", 23, aluno3, 12);
        }

    }
}
