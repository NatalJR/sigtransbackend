package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class FatoresRisco extends GumgaModelUUID {

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_insercao")
    private Date dataInsercao;

}
