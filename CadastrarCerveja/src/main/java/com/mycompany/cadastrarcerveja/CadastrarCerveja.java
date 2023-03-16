/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrarcerveja;

/**
 *
 * @author Root
 */
public class CadastrarCerveja {

       public static void main(String[] args) {
        Cerveja cerveja1 = new Cerveja(32323);
        Cerveja cerveja2 = new Cerveja(5343);
        Cerveja cerveja3 = new Cerveja(2332);
        Cerveja cerveja4 = new Cerveja(5465);
        Cerveja cerveja5 = new Cerveja(65453);

        cerveja1.info("Skol", "garrafa", 14, "6%", "boa");
        cerveja2.info("Brhama", "litro", 20, "7%", "ruim");
        cerveja3.info("Crystal", "garrafa", 30, "3%", "media");
        cerveja4.info("Schin", "litro", 12, "9", "media");
        cerveja5.info("Amstel", "litro", 13, "10%", "boa");

        cerveja1.cervejas();
        cerveja2.cervejas();
        cerveja3.cervejas();
        cerveja4.cervejas();
        cerveja5.cervejas();
    }
}
