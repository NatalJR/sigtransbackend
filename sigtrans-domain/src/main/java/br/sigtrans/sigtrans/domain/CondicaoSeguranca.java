package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CondicaoSeguranca extends GumgaModelUUID {

    @Column(name = "nome_condicao_seguranca")
    private String nome;

    public CondicaoSeguranca() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
