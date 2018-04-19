package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;
import io.gumga.domain.domains.GumgaPhoneNumber;


import javax.annotation.WillClose;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Pessoas extends GumgaModelUUID {

    @Column(name = "nome")
    private String nome;

    @Column(name = "documento")
    private String documento;

    @Column(name = "orgao_exp")
    private String orgaoExp;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "endereco_num")
    private String numero;

    @Column(name = "endereco_complemento")
    private String complemento;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "alergica")
    private String alergica;

    @Column(name = "profissao")
    private String profissao;

    @Column(name = "nacionalidade")
    private String nacionalidade;

    @Column(name = "naturalidade")
    private String naturalidade;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "dt_nasc")
    private String dataNascimento;

    @Column(name = "cnh")
    private String cnh;

    @Column(name = "validade_cnh")
    private String validadeCNH;

    @Column(name = "municipio")
    private String municipio;

    @Column(name = "alergica_desc")
    private String alergicaDesc;

    @Column(name = "estrangeiro")
    private String estrangeiro;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "estado")
    private String estado;

    @Column(name = "efetivo_extra")
    private String efetivoExtra;

    @Column(name = "nome_mae")
    private String nomeMae;

    public Pessoas() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getOrgaoExp() {
        return orgaoExp;
    }

    public void setOrgaoExp(String orgaoExp) {
        this.orgaoExp = orgaoExp;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAlergica() {
        return alergica;
    }

    public void setAlergica(String alergica) {
        this.alergica = alergica;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getValidadeCNH() {
        return validadeCNH;
    }

    public void setValidadeCNH(String validadeCNH) {
        this.validadeCNH = validadeCNH;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getAlergicaDesc() {
        return alergicaDesc;
    }

    public void setAlergicaDesc(String alergicaDesc) {
        this.alergicaDesc = alergicaDesc;
    }

    public String getEstrangeiro() {
        return estrangeiro;
    }

    public void setEstrangeiro(String estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEfetivoExtra() {
        return efetivoExtra;
    }

    public void setEfetivoExtra(String efetivoExtra) {
        this.efetivoExtra = efetivoExtra;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
}
