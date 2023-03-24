/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maintest;

import entity.Cor;
import entity.Marca;
import entity.Modelo;
import entity.Veiculo;

/**
 *
 * @author Aluno
 */
public class MainTest {
    public static void main(String[] args) {
    
        Cor c1 = new Cor ();
        Marca m1 = new Marca();
        Modelo mo1 = new Modelo();
        Veiculo v1 = new Veiculo();
        c1.setId(1);
        c1.setNome("Vermelho");
        m1.setId (1);
        m1.setNome("ford");
        mo1.setId(1);
        mo1.setMarca(m1);
        mo1.setDescricao("bola");
        v1.setId(1);
        v1.setPlaca("dkg 1236");
        v1.setObservacoes("aspirar o interior");
        v1.setModelo(mo1);
        v1.setCor(c1);
        System.out.println(v1);
        
    }
    
}
