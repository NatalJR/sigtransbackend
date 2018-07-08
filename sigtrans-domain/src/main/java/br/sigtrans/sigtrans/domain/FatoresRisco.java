package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class FatoresRisco extends GumgaModelUUID {

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_insercao")
    private Date dataInsercao;

    @Column(name = "anos_validade")
    private int anosValidade;

    public FatoresRisco() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(Date dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    public int getAnosValidade() {
        return anosValidade;
    }

    public void setAnosValidade(int anosValidade) {
        this.anosValidade = anosValidade;
    }
}
