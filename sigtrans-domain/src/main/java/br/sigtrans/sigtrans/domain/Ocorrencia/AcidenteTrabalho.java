package br.sigtrans.sigtrans.domain.Ocorrencia;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class AcidenteTrabalho extends GumgaModelUUID {

    @Column(name = "nome_acidente_trabalho")
    private String nome;

    public AcidenteTrabalho() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
