package br.sigtrans.sigtrans.domain.Obitos;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AnaliseObito extends GumgaModelUUID {

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "analiseobito_fatorriscovalor", joinColumns =
            {@JoinColumn(name = "analiseobito_id")}, inverseJoinColumns =
            {@JoinColumn(name = "fatorriscovalor_id")})
    private Set<FatorRiscoValor> fatoresRisco;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "analiseobito_condutariscovalor", joinColumns =
            {@JoinColumn(name = "analiseobito_id")}, inverseJoinColumns =
            {@JoinColumn(name = "condutariscovalor_id")})
    private Set<CondutaRiscoValor> condutasRisco;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "analiseobito_fatorgravidadevalor", joinColumns =
            {@JoinColumn(name = "analiseobito_id")}, inverseJoinColumns =
            {@JoinColumn(name = "fatorgravidadevalor_id")})
    private Set<FatorGravidadeValor> fatoresGravidade;

    public AnaliseObito() {
    }

    public AnaliseObito(Set<FatorRiscoValor> fatoresRisco, Set<CondutaRiscoValor> condutasRisco, Set<FatorGravidadeValor> fatoresGravidade) {
        this.fatoresRisco = fatoresRisco;
        this.condutasRisco = condutasRisco;
        this.fatoresGravidade = fatoresGravidade;
    }

    public Set<FatorRiscoValor> getFatoresRisco() {
        return fatoresRisco;
    }

    public void setFatoresRisco(Set<FatorRiscoValor> fatoresRisco) {
        this.fatoresRisco = fatoresRisco;
    }

    public Set<CondutaRiscoValor> getCondutasRisco() {
        return condutasRisco;
    }

    public void setCondutasRisco(Set<CondutaRiscoValor> condutasRisco) {
        this.condutasRisco = condutasRisco;
    }

    public Set<FatorGravidadeValor> getFatoresGravidade() {
        return fatoresGravidade;
    }

    public void setFatoresGravidade(Set<FatorGravidadeValor> fatoresGravidade) {
        this.fatoresGravidade = fatoresGravidade;
    }
}
