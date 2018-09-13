package br.sigtrans.sigtrans.domain.Obitos;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class FatorRisco extends GumgaModelUUID {

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_insercao")
    private Date dataInsercao;

    public FatorRisco() {
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
}
