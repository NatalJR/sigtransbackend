package br.sigtrans.sigtrans.domain.Via;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ConservacaoVia extends GumgaModelUUID {

    @Column(name = "nome_conservacao_via")
    private String nome;

    public ConservacaoVia() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
