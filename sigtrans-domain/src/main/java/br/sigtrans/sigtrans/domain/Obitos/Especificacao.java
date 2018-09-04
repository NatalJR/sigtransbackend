package br.sigtrans.sigtrans.domain.Obitos;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Especificacao extends GumgaModelUUID {

    @Column(name = "descricao")
    private String descricao;

    public Especificacao() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
