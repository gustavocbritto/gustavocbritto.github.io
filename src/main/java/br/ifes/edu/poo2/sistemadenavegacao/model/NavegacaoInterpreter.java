/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.sistemadenavegacao.model;

import java.util.HashMap;

/**
 *
 * @author Gustavo
 */
public class NavegacaoInterpreter {
   
    public Navegacao norte, sul, leste, oeste;
    
    public NavegacaoInterpreter(){
        
        norte = new Norte();
        sul = new Sul();
        leste = new Leste();
        oeste = new Oeste();

        norte.addProximo(sul);
        sul.addProximo(leste);
        leste.addProximo(oeste);
      
        
    }
    
    public void buscar(String string){
       norte.pesquisa(string);
    }
}
