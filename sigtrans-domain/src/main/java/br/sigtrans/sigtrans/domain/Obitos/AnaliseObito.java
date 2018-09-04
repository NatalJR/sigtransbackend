package br.sigtrans.sigtrans.domain.Obitos;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class AnaliseObito extends GumgaModelUUID {

    @Column(name = "test")
    private int test;

    public AnaliseObito() {
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }
}
