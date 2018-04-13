package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PosicaoVeiculo extends GumgaModelUUID {

    @Column(name = "nome_posicao_veiculo")
    private String nome;

    public PosicaoVeiculo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
