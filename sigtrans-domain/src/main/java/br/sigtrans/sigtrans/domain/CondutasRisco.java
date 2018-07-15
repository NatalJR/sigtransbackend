package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class CondutasRisco extends GumgaModelUUID {

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_insercao")
    private Date data_insercao;


    private ArrayList<Integer> anosValidade;

    public CondutasRisco() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_insercao() {
        return data_insercao;
    }

    public void setData_insercao(Date data_insercao) {
        this.data_insercao = data_insercao;
    }

    public ArrayList<Integer> getAnosValidade() {
        return anosValidade;
    }

    public void setAnosValidade(ArrayList<Integer> anosValidade) {
        this.anosValidade = anosValidade;
    }
}
