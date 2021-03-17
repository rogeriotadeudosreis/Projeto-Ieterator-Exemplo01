/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rogerio.model;

import br.rogerio.interfaces.Interface_Interator;

/**
 *
 * @author roger
 */
public class VideoIterator implements Interface_Interator {

    VideoItem[] itens;
    int posicao = 0;

    public VideoIterator(VideoItem[] itens) {
        this.itens = itens;
    }

    @Override
    public boolean hasNext() {
        if (posicao >= itens.length || itens[posicao] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        VideoItem videoItem = itens[posicao];
        posicao++;
        return videoItem;
    }
}
