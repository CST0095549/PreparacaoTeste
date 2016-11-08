/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Userpl022pc19
 */
public class Utente {
    
    String nome;
    String dataNascimento;
    String observacoes;

    public Utente(String nome, String datadenascimento, String observacoes) {
        this.nome = nome;
        this.dataNascimento = datadenascimento;
        this.observacoes = observacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatadenascimento() {
        return dataNascimento;
    }

    public void setDatadenascimento(String datadenascimento) {
        this.dataNascimento = datadenascimento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
    
}
