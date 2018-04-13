package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class LocalEncaminhado extends GumgaModelUUID {

    @Column(name = "nome_local_encaminhado")
    private String nome;

    public LocalEncaminhado() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
