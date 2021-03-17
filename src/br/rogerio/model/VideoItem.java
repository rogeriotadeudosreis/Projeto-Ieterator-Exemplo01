/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rogerio.model;

/**
 *
 * @author roger
 */
public class VideoItem {
    
    private String nome;
    private double preco;
    
    public VideoItem (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
}
