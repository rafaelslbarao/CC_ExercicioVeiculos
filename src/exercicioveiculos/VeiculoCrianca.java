/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioveiculos;

/**
 *
 * @author Rafael
 */
public class VeiculoCrianca extends Veiculo{



    public void arranque() {
        posicaoAtual += 1;
    }

    public double getDistanciaTotal() {
        return posicaoAtual * 5;
    }
    
    @Override
    public String getDescricao() {
        return "Veículo Criança com " + getDistanciaTotal() + " rodados";
    }
}
