package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class MarcaVeiculo extends GumgaModelUUID {

    @Column(name = "nome_marca_veiculo")
    private String nome;

    @Column(name = "id_parceiro")
    private String idParceiro;

    public MarcaVeiculo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdParceiro() {
        return idParceiro;
    }

    public void setIdParceiro(String idParceiro) {
        this.idParceiro = idParceiro;
    }
}
