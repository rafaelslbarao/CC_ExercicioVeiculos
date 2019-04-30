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
public class VeiculoCorrida extends Veiculo{

    public VeiculoCorrida() {
        super();
        multiplicadorVelocidade = 5;
    }

    public double getDistanciaTotal() {
        return posicaoAtual / 10;
    }
    
    @Override
    public String getDescricao() {
        return "Veículo Corrida com " + getDistanciaTotal() + " rodados";
    }

//    public void arranque()
//    {
//        posicaoAtual += DESLOCAMENTO_PADRAO * 5;
//    }
}
