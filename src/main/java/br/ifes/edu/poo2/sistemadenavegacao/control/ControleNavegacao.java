/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.sistemadenavegacao.control;

import br.ifes.edu.poo2.sistemadenavegacao.model.NavegacaoInterpreter;

/**
 *
 * @author Gustavo
 */
public class ControleNavegacao {
    private NavegacaoInterpreter navegacao = new NavegacaoInterpreter();
    public void start(){
        navegacao.buscar("Cariacica Vitoria Sao Mateus Oeste");
    }
}
