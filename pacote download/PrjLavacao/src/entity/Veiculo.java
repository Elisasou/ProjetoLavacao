/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Aluno
 */
public class Veiculo {
   private int id;
   private String placa;
   private String observacoes;
   private Modelo modelo;
   private Cor cor;

    
    public Veiculo()
    {
           this.id = 0;
           this.placa = null;
           this.observacoes = null;
           this.modelo= null;
    }
    
    public Veiculo(String placa)
    {
           this.id = 0;
           this.placa = placa;
           this.observacoes = null;
           this.modelo= null;
    }
    
    public Veiculo(int id, String placa, Modelo modelo)
    {
           this.id = id;
           this.placa = placa;
           this.observacoes = null;
           this.modelo= modelo;
    }
    
        public Veiculo(int id, String placa, String observacoes, Modelo modelo, Cor cor)
    {
           this.id = id;
           this.placa = placa;
           this.observacoes = observacoes;
           this.modelo= modelo;
           this.cor=cor;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", placa=" + placa + ", observacoes=" + observacoes + ", modelo=" + modelo + ", cor=" + cor + '}';
    }   
    
}
