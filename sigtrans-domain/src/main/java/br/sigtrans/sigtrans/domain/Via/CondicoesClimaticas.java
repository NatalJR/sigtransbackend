package br.sigtrans.sigtrans.domain.Via;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CondicoesClimaticas extends GumgaModelUUID {

    @Column(name = "nome_condicoes_climaticas")
    private String nome;

    public CondicoesClimaticas() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}