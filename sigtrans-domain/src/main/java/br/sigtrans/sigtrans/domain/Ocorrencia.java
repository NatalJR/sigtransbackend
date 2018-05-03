package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Ocorrencia extends GumgaModelUUID {

    @OneToOne
    private DadosGerais dadosGerais;

    public Ocorrencia() {
    }

    public DadosGerais getDadosGerais() {
        return dadosGerais;
    }

    public void setDadosGerais(DadosGerais dadosGerais) {
        this.dadosGerais = dadosGerais;
    }
}
