package br.sigtrans.sigtrans.domain.Ocorrencia;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class TipoAcidente extends GumgaModelUUID{
    @Column(name="nome_tipo_acidente")
    private String nome;

    public TipoAcidente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
