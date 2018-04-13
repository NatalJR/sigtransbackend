package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ModeloVeiculo extends GumgaModelUUID {

    @Column(name = "nome_modelo_veiculo")
    private String nome;

    @ManyToOne
    private MarcaVeiculo marca;

    @ManyToOne
    private CategoriaVeiculo categoria;

    public ModeloVeiculo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public MarcaVeiculo getMarca() {
        return marca;
    }

    public void setMarca(MarcaVeiculo marca) {
        this.marca = marca;
    }

    public CategoriaVeiculo getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaVeiculo categoria) {
        this.categoria = categoria;
    }
}
