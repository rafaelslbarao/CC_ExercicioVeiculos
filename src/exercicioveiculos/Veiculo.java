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
public abstract class Veiculo implements Publicacao{

    public static final int DESLOCAMENTO_PADRAO = 10;

    protected int posicaoAtual;
    protected int multiplicadorVelocidade;
    
    public Veiculo()
    {
        inicializaVariaveis(1);
    }
    
    public Veiculo(int multiplicador)
    {
        inicializaVariaveis(multiplicador);
    }

    public void inicializaVariaveis(int multiplicadorVelocidade) {
        posicaoAtual = 0;
        this.multiplicadorVelocidade = multiplicadorVelocidade;
    }

    public void arranque() {
        posicaoAtual += DESLOCAMENTO_PADRAO * multiplicadorVelocidade;
    }
    
    public double getDistanciaTotal()
    {
        return (double) posicaoAtual;
    }
}
