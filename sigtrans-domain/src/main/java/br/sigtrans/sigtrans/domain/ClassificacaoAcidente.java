package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ClassificacaoAcidente extends GumgaModelUUID {

    @Column(name = "nome_classificacao_acidente")
    private String nome;

    public ClassificacaoAcidente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
