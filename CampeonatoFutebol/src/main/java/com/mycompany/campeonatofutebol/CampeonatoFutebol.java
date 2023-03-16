/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.campeonatofutebol;

/**
 *
 * @author Root
 */
public class CampeonatoFutebol {

      public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        Jogador jogador3 = new Jogador();
        Jogador jogador4 = new Jogador();
        Jogador jogador5 = new Jogador();
        jogador1.adicionar("matheus", "Barcelona", "machucado", 1.83, 90);
        jogador2.adicionar("carlos", "Real Madrid", "machucado", 1.84, 76);
        jogador3.adicionar("lucas", "Sao Paulo", "jogando", 1.82, 87);
        jogador4.adicionar("felipe", "Japao", "jogando", 1.90, 98);
        jogador5.adicionar("juan", "Santos", "machucado", 1.73, 87);
    
        Times barcelona = new Times();
        Times santos = new Times();
        
        barcelona.team("Barcelona", jogador1, 0, 4, "Jusimar");
        santos.team("Santos", jogador5, 0, 5, "Leandro");
    
        System.out.println("Jogo: " + barcelona.Time + " x " + santos.Time);
        barcelona.info();
        santos.info();
    }

}
