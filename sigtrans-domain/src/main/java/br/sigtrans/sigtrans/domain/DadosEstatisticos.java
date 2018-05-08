package br.sigtrans.sigtrans.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Embeddable
public class DadosEstatisticos {

    private String zona;
    private int acidenteTrabalho;

    @ManyToOne
    private TipoAcidente tipoAcidente;
    @ManyToOne
    private ClassificacaoAcidente classificacaoAcidente;
    @OneToMany
    private Set<Via> vias;

    public DadosEstatisticos() {
    }

    public DadosEstatisticos(String zona, int acidenteTrabalho, TipoAcidente tipoAcidente, ClassificacaoAcidente classificacaoAcidente, Set<Via> vias) {
        this.zona = zona;
        this.acidenteTrabalho = acidenteTrabalho;
        this.tipoAcidente = tipoAcidente;
        this.classificacaoAcidente = classificacaoAcidente;
        this.vias = vias;
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

    public Set<Via> getVias() {
        return vias;
    }

    public void setVias(Set<Via> vias) {
        this.vias = vias;
    }
}
