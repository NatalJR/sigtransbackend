package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Veiculos extends GumgaModelUUID {

    @ManyToOne
    private MarcaVeiculo marca;

    @ManyToOne
    private ModeloVeiculo modelo;

    @Column(name = "cnh")
    private String cnh;

    @Column(name = "numero_ocupantes")
    private int numero_ocupantes;

    @Column(name = "numero_feridos")
    private int numero_feridos;

    @Column(name = "numero_obitos")
    private int numero_obitos;

    @ManyToOne
    private CategoriaVeiculo categoria;

    @Column(name = "placa")
    private String placa;


    //branch testing

    public Veiculos() {
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

    public int getNumero_ocupantes() {
        return numero_ocupantes;
    }

    public void setNumero_ocupantes(int numero_ocupantes) {
        this.numero_ocupantes = numero_ocupantes;
    }

    public int getNumero_feridos() {
        return numero_feridos;
    }

    public void setNumero_feridos(int numero_feridos) {
        this.numero_feridos = numero_feridos;
    }

    public int getNumero_obitos() {
        return numero_obitos;
    }

    public void setNumero_obitos(int numero_obitos) {
        this.numero_obitos = numero_obitos;
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
