package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class SinalizacaoVertical extends GumgaModelUUID {

    @Column(name = "nome_sianlizacao_vertical")
    private String nome;

    public SinalizacaoVertical() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
