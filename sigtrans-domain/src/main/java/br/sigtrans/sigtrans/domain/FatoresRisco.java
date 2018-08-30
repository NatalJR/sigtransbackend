package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.Set;

@Entity
public class FatoresRisco extends GumgaModelUUID {

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_insercao")
    private Date dataInsercao;

    @OneToOne
    private Set<Integer> anosValidade;

    public FatoresRisco() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(Date dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    public Set<Integer> getAnosValidade() {
        return anosValidade;
    }

    public void setAnosValidade(Set<Integer> anosValidade) {
        this.anosValidade = anosValidade;
    }
}
