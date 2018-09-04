package br.sigtrans.sigtrans.domain.Via;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CondicaoTecnica extends GumgaModelUUID {
    @Column(name = "nome_condicao_tecnica")
    private String nome;

    public CondicaoTecnica() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}