package br.sigtrans.sigtrans.domain.Obitos;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class CondutaRiscoValor extends GumgaModelUUID {

    @ManyToOne
    private CondutaRisco condutaRisco;

    @Column(name = "valor")
    private Integer valor;

    public CondutaRiscoValor(CondutaRisco condutaRisco, Integer valor) {
        this.condutaRisco = condutaRisco;
        this.valor = valor;
    }

    public CondutaRiscoValor() {
    }

    public CondutaRisco getCondutaRisco() {
        return condutaRisco;
    }

    public void setCondutaRisco(CondutaRisco condutaRisco) {
        this.condutaRisco = condutaRisco;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

}
