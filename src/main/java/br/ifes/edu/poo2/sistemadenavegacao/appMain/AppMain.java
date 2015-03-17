/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.sistemadenavegacao.appMain;

import br.ifes.edu.poo2.sistemadenavegacao.control.ControleNavegacao;

/**
 *
 * @author Gustavo
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControleNavegacao controle = new ControleNavegacao();
        controle.start();
    }
    
}
