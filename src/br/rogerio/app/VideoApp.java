/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rogerio.app;

import br.rogerio.interfaces.Interface_Interator;
import br.rogerio.model.VideoItem;
import br.rogerio.model.VideoIterator;

/**
 *
 * @author roger
 */
public class VideoApp {

    public static void main(String[] args) {

        VideoItem[] videoItens = new VideoItem[4];

        videoItens[0] = new VideoItem("Homem Aranha", 2.5);
        videoItens[1] = new VideoItem("Casa do Lago", 1.5);
        videoItens[2] = new VideoItem("Agente 007", 1.5);
        videoItens[3] = new VideoItem("Anjos da Lei", 2.0);

        Interface_Interator videoIterator = new VideoIterator(videoItens);

        while (videoIterator.hasNext()) {
            VideoItem videoItem = (VideoItem) videoIterator.next();
            System.out.println(videoItem.getNome() + " = R$ " +
                    String.format("%.2f", videoItem.getPreco()));
        }
    }
}
