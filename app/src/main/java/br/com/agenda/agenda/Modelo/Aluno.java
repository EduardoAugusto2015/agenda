package br.com.agenda.agenda.Modelo;

import java.io.Serializable;

/**
 * Created by duh on 01/03/17.
 */

public class Aluno implements Serializable {

    private Long Id;
    private String nome;
    private String endereco;
    private String telefone;
    private String site;
    private Float nota;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public String toString(){

        return getId() +" - "+ getNome();
    }

}
