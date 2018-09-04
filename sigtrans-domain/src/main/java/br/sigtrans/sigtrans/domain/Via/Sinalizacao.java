package br.sigtrans.sigtrans.domain.Via;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Sinalizacao extends GumgaModelUUID {

    @Column(name = "nome_sinalizacao")
    private String nome;

    public Sinalizacao() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
