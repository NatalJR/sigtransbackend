package br.sigtrans.sigtrans.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Vitima extends Envolvido {

    @ManyToOne
    private Lesoes lesao;

    @ManyToOne
    private LocalEncaminhado localEncaminhado;

    @Column(name = "aih")
    private String aih;

    public Vitima() {
    }

    public Lesoes getLesao() {
        return lesao;
    }

    public void setLesao(Lesoes lesao) {
        this.lesao = lesao;
    }

    public LocalEncaminhado getLocalEncaminhado() {
        return localEncaminhado;
    }

    public void setLocalEncaminhado(LocalEncaminhado localEncaminhado) {
        this.localEncaminhado = localEncaminhado;
    }

    public String getAih() {
        return aih;
    }

    public void setAih(String aih) {
        this.aih = aih;
    }
}
