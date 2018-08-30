package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Paciente extends GumgaModelUUID {

    @Column(name = "nome")
    private String nome;

    @Column(name = "nome_mae")
    private String nomeMae;

    @Column(name = "numero_cartao_sus")
    private String numeroCartaoSus;

    private Date dataNascimento;

    //código do tipo de logradouro do paciente

    @ManyToOne
    private Rua rua;

    @Column(name = "numero")
    private String numero;

    @Column(name = "complemento")
    private String complemento;

    @ManyToOne
    private Bairro bairro;

    @ManyToOne
    private Municipio municipioOriginal;

    @ManyToOne
    private Estado estadoOriginal;

    // tipo de documento do paciente

    @Column(name = "numero_documento")
    private String numeroDocumento;

    @Column(name = "idade")
    private int idade;

    @Column(name = "sexo")
    private char sexo;

    public Paciente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNumeroCartaoSus() {
        return numeroCartaoSus;
    }

    public void setNumeroCartaoSus(String numeroCartaoSus) {
        this.numeroCartaoSus = numeroCartaoSus;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Rua getRua() {
        return rua;
    }

    public void setRua(Rua rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Municipio getMunicipioOriginal() {
        return municipioOriginal;
    }

    public void setMunicipioOriginal(Municipio municipioOriginal) {
        this.municipioOriginal = municipioOriginal;
    }

    public Estado getEstadoOriginal() {
        return estadoOriginal;
    }

    public void setEstadoOriginal(Estado estadoOriginal) {
        this.estadoOriginal = estadoOriginal;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
