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

    @ManyToOne
    private Envolvido condutor;

    @ManyToOne
    private Estado estado;

    @ManyToOne
    private Municipio municipio;

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

    public Envolvido getCondutor() {
        return condutor;
    }

    public void setCondutor(Envolvido condutor) {
        this.condutor = condutor;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
}
