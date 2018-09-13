package br.sigtrans.sigtrans.domain.Obitos;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class FatorRiscoValor extends GumgaModelUUID {

    @ManyToOne
    private FatorRisco fatorRisco;

    @Column(name = "valor")
    private Integer valor;

    public FatorRiscoValor(FatorRisco fatorRisco, Integer valor) {
        this.fatorRisco = fatorRisco;
        this.valor = valor;
    }

    public FatorRiscoValor() {
    }

    public FatorRisco getFatorRisco() {
        return fatorRisco;
    }

    public void setFatorRisco(FatorRisco fatorRisco) {
        this.fatorRisco = fatorRisco;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
