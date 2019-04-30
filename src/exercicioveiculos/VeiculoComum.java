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
public class VeiculoComum extends Veiculo{

    @Override
    public String getDescricao() {
        return "Veículo Comum com " + getDistanciaTotal() + " rodados";
    }
    
}
