package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CategoriaVeiculo extends GumgaModelUUID {

    @Column(name = "nome_categoria_veiculo")
    private String nome;

    public CategoriaVeiculo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
