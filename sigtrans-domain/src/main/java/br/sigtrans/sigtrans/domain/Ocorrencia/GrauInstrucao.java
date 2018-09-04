package br.sigtrans.sigtrans.domain.Ocorrencia;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class GrauInstrucao extends GumgaModelUUID {
    @Column(name = "nome_instrucao")
    private String nome;

    public GrauInstrucao() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
