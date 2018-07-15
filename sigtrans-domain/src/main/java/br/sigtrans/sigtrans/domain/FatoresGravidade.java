package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class FatoresGravidade extends GumgaModelUUID {
    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_insercao")
    private Date dataInsercao;

    private ArrayList<Integer> anosValidade;

    public FatoresGravidade() {
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

    public ArrayList<Integer> getAnosValidade() {
        return anosValidade;
    }

    public void setAnosValidade(ArrayList<Integer> anosValidade) {
        this.anosValidade = anosValidade;
    }
}
