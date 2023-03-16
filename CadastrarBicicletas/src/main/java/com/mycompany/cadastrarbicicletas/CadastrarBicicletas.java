/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrarbicicletas;

/**
 *
 * @author Root
 */
public class CadastrarBicicletas {

        public static void main(String[] args) {
        Bicicletas bicicleta1 = new Bicicletas("Caloi", "forte", "speed");
        bicicleta1.setVel(6, 20);
        bicicleta1.setCorValor("rosa", 2000);
        
        Bicicletas bicicleta2 = new Bicicletas("Caloi", "fraca", "comum");
        bicicleta2.setVel(5, 21);
        bicicleta2.setCorValor("azul", 1900.9);
        
        Bicicletas bicicleta3 = new Bicicletas("Caloi", "mediana", "velocidade");
        bicicleta3.setVel(7, 19);
        bicicleta3.setCorValor("vermelha", 900);
        
        Bicicletas bicicleta4 = new Bicicletas("Caloi", "forte", "perfomace");
        bicicleta4.setVel(4, 22);
        bicicleta4.setCorValor("Preta", 3223);
        
        System.out.println(bicicleta1.getInfo());
        System.out.println(bicicleta1.getGeral());
        System.out.println(bicicleta1.getInfo());
        System.out.println(bicicleta1.getGeral()); 
    }
}
