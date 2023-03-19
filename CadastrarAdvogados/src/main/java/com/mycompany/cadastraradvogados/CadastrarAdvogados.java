/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastraradvogados;

/**
 *
 * @author Root
 */
public class CadastrarAdvogados {

    public static void main(String[] args) {
        
        Advogado advogado1 = new Advogado("Juan", 23);
        Advogado advogado2 = new Advogado("Matias", 54);
        Advogado advogado3 = new Advogado("Bernado", 43);
        Advogado advogado4 = new Advogado("Gabriel", 32);
        Advogado advogado5 = new Advogado("José", 25);
        Advogado advogado6 = new Advogado("Geraldo", 30);
        Advogado advogado7 = new Advogado("João", 55);
        Advogado advogado8 = new Advogado("Leonardo", 45);

        advogado1.definir(33256, "Juan LTDA", "Trabalhista", 15, 5);
        advogado2.definir(37516, "Matias LTDA", "Digital", 5, 5);
        advogado3.definir(44512, "Bernado LTDA", "Agronegócio", 35, 15);
        advogado4.definir(78945, "Gabriel LTDA", "Gestão Publica", 78, 5);
        advogado5.definir(12345, "José LTDA", "Trabalhista", 35, 0);
        advogado6.definir(46782, "Geraldo LTDA", "Ambiental", 15, 25);
        advogado7.definir(79135, "João LTDA", "Digital", 5, 5);
        advogado8.definir(46825, "Leonardo LTDA", "Administrativo", 49, 50);

        advogado6.info();
        System.out.println("");
        advogado7.info();
        System.out.println("");
        advogado8.info();
    }
}
