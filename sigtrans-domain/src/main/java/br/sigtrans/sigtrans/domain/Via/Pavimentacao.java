package br.sigtrans.sigtrans.domain.Via;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Pavimentacao extends GumgaModelUUID {

    @Column(name = "nome_pavimentacao")
    private String nome;

    public Pavimentacao() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
