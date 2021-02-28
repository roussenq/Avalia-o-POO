/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao.controle;

import avaliacao.entidade.Veiculo;
import avaliacao.util.UtilGerador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class VeiculoNegocio {
    
    private List<Veiculo> veiculos = new ArrayList<>();
    
    public List<Veiculo> carregarListaVeiculo(){
        int qtd = UtilGerador.criarNumeroAleatorioEntre2Valores(9, 21);
        Veiculo veiculo;
        for(int i = 0; i < qtd; i++){
        veiculo = new Veiculo(
                UtilGerador.gerarTipoVeiculo(),
                UtilGerador.gerarModelo(),
                UtilGerador.gerarFabricante(),
                UtilGerador.gerarAnoAutomovel(),
                UtilGerador.gerarPlaca(),
                " R$"+UtilGerador.gerarNumInteiro(4)
        );
        veiculos.add(veiculo);
        }
        return veiculos;
    }

    public List<Veiculo> pesquisarVeiculosAnoMenor2018(List<Veiculo> veiculos){
        List<Veiculo> veiculosPesquisados = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getAnoFabricacao() < 2018){
                veiculosPesquisados.add(veiculo);
            }
        }
        return veiculosPesquisados;
    } 
    
    public List<Veiculo> pesquisarVeiculosPorFabricante(List<Veiculo> veiculos, String fabricante){
        List<Veiculo> fabricantesPesquisados = new ArrayList<>();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getFabricante().equalsIgnoreCase(fabricante)){
                fabricantesPesquisados.add(veiculo);
            }
        }
        return fabricantesPesquisados;
    } 
    
    public Veiculo pesquisarVeiculosPorPlaca(List<Veiculo> veiculos, String placa){
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)){
                return veiculo;
            }
        }
        return null;
    } 
    
}
