package br.sigtrans.sigtrans.domain.Ocorrencia;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class SeparacaoPista extends GumgaModelUUID {
    @Column(name = "nome_separacao_pista")
    private String nome;

    public SeparacaoPista() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
