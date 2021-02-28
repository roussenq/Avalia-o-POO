/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao.visao;

import avaliacao.controle.VeiculoNegocio;
import avaliacao.entidade.Veiculo;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class TestaVeiculo {
    public static void main(String[] args) {
        
        VeiculoNegocio v1 = new VeiculoNegocio();
        List<Veiculo> veiculos = v1.carregarListaVeiculo();
        
        System.out.println("----== Veiuclos Cadastrados ==----");
        mostrar(veiculos);
        
        System.out.println("----== Veiculos com ano menor que 2018 ==-----");
        List<Veiculo> pesquisados = v1.pesquisarVeiculosAnoMenor2018(veiculos);
        mostrar(pesquisados);
        
        System.out.println("----== Veiculos com o fabricante pesquisado ==-----");
        String fabricante = JOptionPane.showInputDialog("Informe o fabricante a ser pesquisado:\n(KIA/HONDA/FIAT/GM/FORD/MERCEDES)");
        List<Veiculo> fabricantesPesquisados = v1.pesquisarVeiculosPorFabricante(veiculos, fabricante);
        mostrar(fabricantesPesquisados);
        
        
        System.out.println("----== Pesquisa de veiculo por placa ==-----");
        String placa = JOptionPane.showInputDialog("Informe a placa a ser pesquisado: ");
        Veiculo veiculo = v1.pesquisarVeiculosPorPlaca(veiculos, placa);
        mostrar(veiculo);
        
        
        
    }
    
    private static void mostrar(List<Veiculo> veiculos){
        for (Veiculo veiculo : veiculos) {
            System.out.println("Tipo: " + veiculo.getTipo());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Fabricante: " + veiculo.getFabricante());
            System.out.println("Ano Fabricação: " + veiculo.getAnoFabricacao());
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Valor" + veiculo.getValor());
            System.out.println("-----------------------------------");
        }
    }
    

    private static void mostrar(Veiculo veiculo){
       
            System.out.println("Tipo: " + veiculo.getTipo());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Fabricante: " + veiculo.getFabricante());
            System.out.println("Ano Fabricação: " + veiculo.getAnoFabricacao());
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Valor" + veiculo.getValor());
            System.out.println("-----------------------------------");
        
    }
    
    
    
    
}
