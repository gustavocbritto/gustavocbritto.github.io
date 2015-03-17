/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.sistemadenavegacao.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Gustavo
 */
public abstract class ANavegacao implements Navegacao{
    public Navegacao proximo;
    public String tipoTratado; 
   // protected HashMap<String, Ponto> cidade = new HashMap<>();
    protected ArrayList<Ponto> pontos = new ArrayList<>();

    public ANavegacao() {
        pontos.add(new Ponto(1,1, "Cariacica"));
        pontos.add(new Ponto(2,2, "Vitoria"));
        pontos.add(new Ponto(3,3,"Linhares"));
        pontos.add(new Ponto(4,4, "Sao Mateus"));
        pontos.add(new Ponto(5,5,"Bahia"));
        
        
        /*cidade.put("Vitoria", new Ponto(2,2));
        cidade.put("Cariacica", new Ponto(1,1));
        cidade.put("Sao Mateus", new Ponto(4,4));
        cidade.put("Linhares", new Ponto(3,3));
        cidade.put("Bahia", new Ponto(5,5));*/
    }
    
    public void addProximo(Navegacao prox){
        proximo = prox;        
    }
    
    public void pesquisa(String pesquisa){
        if(pesquisa.contains(tipoTratado)){
          System.out.println(tratarPesquisa(pesquisa));
        }else
            proximo.pesquisa(pesquisa);
    }

    @Override
    public Navegacao next() {
        return proximo;
    }
    
    public abstract String tratarPesquisa(String pesquisa);
}
