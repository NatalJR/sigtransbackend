package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Profissao extends GumgaModelUUID {
    @Column(name = "nome_profissao")
    private String nome;

    public Profissao() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
