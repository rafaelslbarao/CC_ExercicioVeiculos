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
public class ExercicioVeiculos {
    public static ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculo veiculo = new VeiculoCrianca();
        listaVeiculos.add(veiculo);
        //
        veiculo = new VeiculoComum();
        listaVeiculos.add(veiculo);
        //
        veiculo = new VeiculoCorrida();
        listaVeiculos.add(veiculo);
        //
        arranqueTodosVeiculos();
        //
        ArrayList<Publicacao> listaPublicacao = new ArrayList<>();
        listaPublicacao.addAll(listaVeiculos);
        new MinhaRevista().exibeDescricoesAnuncio(listaPublicacao);
    }
    
    public static void arranqueTodosVeiculos()
    {
        for(Veiculo veiculo : listaVeiculos)
        {
            veiculo.arranque();
        }
    }
    

    
}
