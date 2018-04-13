package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ConservacaoPista extends GumgaModelUUID {

    @Column(name = "nome_conservacao_pista")
    private String nome;

    public ConservacaoPista() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
