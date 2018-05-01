package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class EquipamentoControleTrafego extends GumgaModelUUID {
    @Column(name = "nome_equipamento_controle_trafego")
    private String nome;

    public EquipamentoControleTrafego() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
