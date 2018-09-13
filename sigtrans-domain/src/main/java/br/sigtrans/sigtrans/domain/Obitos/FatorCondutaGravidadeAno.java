package br.sigtrans.sigtrans.domain.Obitos;

import br.sigtrans.sigtrans.domain.Ano;
import io.gumga.domain.GumgaModelUUID;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FatorCondutaGravidadeAno extends GumgaModelUUID {

    @OneToOne
    private Ano ano;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "fatorcondutagravidadeano_fatoresrisco", joinColumns =
            {@JoinColumn(name = "fatorcondutagravidadeano_id")}, inverseJoinColumns =
            {@JoinColumn(name = "fatoresrisco_id")})
    private Set<FatorRisco> fatoresRisco;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "fatorcondutagravidadeano_fatoresgravidade", joinColumns =
            {@JoinColumn(name = "fatorcondutagravidadeano_id")}, inverseJoinColumns =
            {@JoinColumn(name = "fatoresgravidade_id")})
    private Set<FatorGravidade> fatoresGravidade;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "fatorcondutagravidadeano_condutasrisco", joinColumns =
            {@JoinColumn(name = "fatorcondutagravidadeano_id")}, inverseJoinColumns =
            {@JoinColumn(name = "condutasrisco_id")})
    private Set<CondutaRisco> condutasRisco;

    public FatorCondutaGravidadeAno() {
    }

    public Ano getAno() {
        return ano;
    }

    public void setAno(Ano ano) {
        this.ano = ano;
    }

    public Set<FatorRisco> getFatoresRisco() {
        return fatoresRisco;
    }

    public void setFatoresRisco(Set<FatorRisco> fatoresRisco) {
        this.fatoresRisco = fatoresRisco;
    }

    public Set<FatorGravidade> getFatoresGravidade() {
        return fatoresGravidade;
    }

    public void setFatoresGravidade(Set<FatorGravidade> fatoresGravidade) {
        this.fatoresGravidade = fatoresGravidade;
    }

    public Set<CondutaRisco> getCondutasRisco() {
        return condutasRisco;
    }

    public void setCondutasRisco(Set<CondutaRisco> condutasRisco) {
        this.condutasRisco = condutasRisco;
    }
}