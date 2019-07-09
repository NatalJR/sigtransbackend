package br.sigtrans.sigtrans.domain.Ocorrencia;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.*;
import java.util.Set;

@Entity
public class DadosEstatisticos extends GumgaModelUUID {

    @Column(name = "zona")
    private String zona;

    @ManyToOne
    private AcidenteTrabalho acidenteTrabalho;

    @ManyToOne
    private TipoAcidente tipoAcidente;

    @Column(name = "tipo_acidente_original")
    private String tipoAcidenteOriginal;

    @ManyToOne
    private ClassificacaoAcidente classificacaoAcidente;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Via> vias;

    public DadosEstatisticos() {
    }

    public DadosEstatisticos(String zona, AcidenteTrabalho acidenteTrabalho, TipoAcidente tipoAcidente, ClassificacaoAcidente classificacaoAcidente, Set<Via> vias) {
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

    public AcidenteTrabalho getAcidenteTrabalho() {
        return acidenteTrabalho;
    }

    public void setAcidenteTrabalho(AcidenteTrabalho acidenteTrabalho) {
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

    public String getTipoAcidenteOriginal() {
        return tipoAcidenteOriginal;
    }

    public void setTipoAcidenteOriginal(String tipoAcidenteOriginal) {
        this.tipoAcidenteOriginal = tipoAcidenteOriginal;
    }
}
