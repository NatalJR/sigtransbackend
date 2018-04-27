package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class EquipamentoControle extends GumgaModelUUID {

    @Column(name = "nome_equipamento_controle")
    private String nome;

    public EquipamentoControle() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
