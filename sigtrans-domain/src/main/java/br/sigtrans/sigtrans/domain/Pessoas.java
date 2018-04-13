package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;
import io.gumga.domain.domains.GumgaPhoneNumber;


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
    private String orgao_exp;

    @Column(name = "sexo")
    private String sexo;

    @ManyToOne
    private Rua endereco;

    @Column(name = "endereco_num")
    private String numero;

    @Column(name = "endereco_complemento")
    private String complemento;

    @Column(name = "telefone")
    private GumgaPhoneNumber telefone;

    @Column(name = "profissao")
    private String profissao;

    @Column(name = "nacionalidade")
    private String nacionalidade;

    @Column(name = "naturalidade")
    private String naturalidade;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "data_nasc")
    private String data_nasc;

    @Column(name = "cnh")
    private String cnh;

    @Column(name = "validade")
    private String validade;

    @ManyToOne
    private Cidade municipio;

    @Column(name = "nome_mae")
    private String nome_mae;

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

    public String getOrgao_exp() {
        return orgao_exp;
    }

    public void setOrgao_exp(String orgao_exp) {
        this.orgao_exp = orgao_exp;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Rua getEndereco() {
        return endereco;
    }

    public void setEndereco(Rua endereco) {
        this.endereco = endereco;
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

    public GumgaPhoneNumber getTelefone() {
        return telefone;
    }

    public void setTelefone(GumgaPhoneNumber telefone) {
        this.telefone = telefone;
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

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public Cidade getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Cidade municipio) {
        this.municipio = municipio;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }
}
