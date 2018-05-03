package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class DadosEstatisticos extends GumgaModelUUID {

    @Column(name = "zona")
    private String zona;

    @Column(name = "acidente_trabalho")
    private int acidenteTrabalho;

    @ManyToOne
    private TipoAcidente tipoAcidente;

    @ManyToOne
    private ClassificacaoAcidente classificacaoAcidente;

    @OneToMany
    private List<Via> vias;

    public DadosEstatisticos() {
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getAcidenteTrabalho() {
        return acidenteTrabalho;
    }

    public void setAcidenteTrabalho(int acidenteTrabalho) {
        this.acidenteTrabalho = acidenteTrabalho;
    }

    public TipoAcidente getTipoAcidente() {
        return tipoAcidente;
    }

    public void setTipoAcidente(TipoAcidente tipoAcidente) {
        this.tipoAcidente = tipoAcidente;
    }

    public ClassificacaoAcidente getClassificacaoAcidente() {
        return classificacaoAcidente;
    }

    public void setClassificacaoAcidente(ClassificacaoAcidente classificacaoAcidente) {
        this.classificacaoAcidente = classificacaoAcidente;
    }

    public List<Via> getVias() {
        return vias;
    }

    public void setVias(List<Via> vias) {
        this.vias = vias;
    }
}
