package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Vitima extends GumgaModelUUID {

    @OneToOne
    private Envolvido envolvido;

    @ManyToOne
    private Lesoes lesao;

    @ManyToOne
    private LocalEncaminhado localEncaminhado;

    @Column(name = "aih")
    private int aih;

    public Vitima() {
    }

    public Envolvido getEnvolvido() {
        return envolvido;
    }

    public void setEnvolvido(Envolvido envolvido) {
        this.envolvido = envolvido;
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

    public int getAih() {
        return aih;
    }

    public void setAih(int aih) {
        this.aih = aih;
    }
}
