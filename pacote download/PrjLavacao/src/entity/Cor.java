/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Aluno
 */
public class Cor {
    private long id;
    private String nome;
    
    
    public Cor()
    {
        this.id=0;
        this.nome=null;
    }
    
    public Cor(String nome)
    {
        this.id=0;
        this.nome=nome;
    }
    
    public Cor(int id, String nome)
    {
        this.id=id;
        this.nome=nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cor{" + "id=" + id + ", nome=" + nome + '}';
    }
}
