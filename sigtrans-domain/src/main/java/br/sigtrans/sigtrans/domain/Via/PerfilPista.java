package br.sigtrans.sigtrans.domain.Via;


import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PerfilPista extends GumgaModelUUID {

    @Column(name = "nome_perfil_pista")
    private String nome;

    public PerfilPista() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
