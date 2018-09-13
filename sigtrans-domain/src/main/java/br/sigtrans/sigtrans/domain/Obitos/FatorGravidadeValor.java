package br.sigtrans.sigtrans.domain.Obitos;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class FatorGravidadeValor extends GumgaModelUUID {
    @ManyToOne
    private FatorGravidade fatorGravidade;

    @Column(name = "valor")
    private Integer valor;

    public FatorGravidadeValor(FatorGravidade fatorGravidade, Integer valor) {
        this.fatorGravidade = fatorGravidade;
        this.valor = valor;
    }

    public FatorGravidadeValor() {
    }

    public FatorGravidade getFatorGravidade() {
        return fatorGravidade;
    }

    public void setFatorGravidade(FatorGravidade fatorGravidade) {
        this.fatorGravidade = fatorGravidade;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
