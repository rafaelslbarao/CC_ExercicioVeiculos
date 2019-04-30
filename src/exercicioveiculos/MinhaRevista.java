/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioveiculos;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class MinhaRevista {
       
    public void exibeDescricoesAnuncio(ArrayList<Publicacao> listaPublicacao)
    {
        for(Publicacao publicacao : listaPublicacao)
        {
            System.out.println(publicacao.getDescricao());
        }
    }
}
