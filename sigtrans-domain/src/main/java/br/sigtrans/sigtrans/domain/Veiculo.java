package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Veiculo extends GumgaModelUUID {

    @ManyToOne
    private MarcaVeiculo marca;

    @ManyToOne
    private ModeloVeiculo modelo;

    @Column(name = "cnh")
    private String cnh;

    @Column(name = "numero_ocupantes")
    private int numeroOcupantes;

    @Column(name = "numero_feridos")
    private int numeroFeridos;

    @Column(name = "numero_obitos")
    private int numeroObitos;

    @ManyToOne
    private CategoriaVeiculo categoria;

    @Column(name = "placa")
    private String placa;

    public Veiculo() {
    }

    public MarcaVeiculo getMarca() {
        return marca;
    }

    public void setMarca(MarcaVeiculo marca) {
        this.marca = marca;
    }

    public ModeloVeiculo getModelo() {
        return modelo;
    }

    public void setModelo(ModeloVeiculo modelo) {
        this.modelo = modelo;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public int getNumeroOcupantes() {
        return numeroOcupantes;
    }

    public void setNumeroOcupantes(int numeroOcupantes) {
        this.numeroOcupantes = numeroOcupantes;
    }

    public int getNumeroFeridos() {
        return numeroFeridos;
    }

    public void setNumeroFeridos(int numeroFeridos) {
        this.numeroFeridos = numeroFeridos;
    }

    public int getNumeroObitos() {
        return numeroObitos;
    }

    public void setNumeroObitos(int numeroObitos) {
        this.numeroObitos = numeroObitos;
    }

    public CategoriaVeiculo getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaVeiculo categoria) {
        this.categoria = categoria;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
