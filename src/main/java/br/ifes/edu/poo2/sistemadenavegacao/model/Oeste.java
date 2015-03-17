/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.sistemadenavegacao.model;

/**
 *
 * @author Gustavo
 */
public class Oeste  extends ANavegacao  {

    public Oeste() {
        tipoTratado = "Oeste";
    }
   
    @Override
    public String tratarPesquisa(String pesquisa) {
        int menor = 20;
        int index = 0;
        
        for(int i = pontos.size()-1; i >= 0; i--){
            if(pesquisa.contains(pontos.get(i).getCidade())){
                if(pontos.get(i).getX() < menor){
                    menor = pontos.get(i).getY();
                    index = i;
                }
            }
        }
       return pontos.get(index).getCidade();
    }

    
}
