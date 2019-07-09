package br.sigtrans.sigtrans.domain.Ocorrencia;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Parceiro extends GumgaModelUUID {

    @Column(name = "nome_parceiro")
    private String nome;

    @ManyToOne
    private Estado estado;

    @ManyToOne
    private Municipio municipio;

    @Column(name = "observacao")
    private String observacao;

    public Parceiro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public String getObs() {
        return observacao;
    }

    public void setObs(String observacao) {
        this.observacao = observacao;
    }
}
