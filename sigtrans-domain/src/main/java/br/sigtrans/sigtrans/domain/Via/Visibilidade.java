package br.sigtrans.sigtrans.domain.Via;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Visibilidade extends GumgaModelUUID {
    @Column(name = "nome_visibilidade")
    private String nome;

    public Visibilidade() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
