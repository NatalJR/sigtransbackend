package br.sigtrans.sigtrans.domain;

import javax.persistence.*;
import java.util.Set;

@Embeddable
public class AnaliseObito {

    //FIXME PLS
    @ManyToMany(fetch = FetchType.EAGER)
    private FatoresGravidade fatoresGravidade;
    @ManyToMany(fetch = FetchType.EAGER)
    private FatoresRisco fatoresRisco;
    @ManyToMany(fetch = FetchType.EAGER)
    private CondutasRisco condutasRisco;

    public AnaliseObito(FatoresGravidade fatoresGravidade, FatoresRisco fatoresRisco, CondutasRisco condutasRisco) {
        this.fatoresGravidade = fatoresGravidade;
        this.fatoresRisco = fatoresRisco;
        this.condutasRisco = condutasRisco;
    }

    public AnaliseObito() {
    }

    public FatoresGravidade getFatoresGravidade() {
        return fatoresGravidade;
    }

    public void setFatoresGravidade(FatoresGravidade fatoresGravidade) {
        this.fatoresGravidade = fatoresGravidade;
    }

    public FatoresRisco getFatoresRisco() {
        return fatoresRisco;
    }

    public void setFatoresRisco(FatoresRisco fatoresRisco) {
        this.fatoresRisco = fatoresRisco;
    }

    public CondutasRisco getCondutasRisco() {
        return condutasRisco;
    }

    public void setCondutasRisco(CondutasRisco condutasRisco) {
        this.condutasRisco = condutasRisco;
    }
}
