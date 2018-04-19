package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Envolvido extends GumgaModelUUID {

    @Column(name = "nome")
    private String nome;

    @ManyToOne
    private Estado estado;

    @ManyToOne
    private Cidade cidade;

    @ManyToOne
    private Rua rua;

    @Column(name = "numero")
    private  String numero;

    @Column(name = "nome_mae")
    private String nome_mae;

    @ManyToOne
    private Veiculos veiculo;

    @ManyToOne
    private PosicaoVeiculo posicao_veiculo;

    @ManyToOne
    private CondicaoSeguranca condicao_seguranca;

    @ManyToOne
    private Lesoes lesao;

    @ManyToOne
    private LocalEncaminhado local_encaminhado;

    @Column(name = "documento") //RG
    private String documento;

    @Column(name = "orgao_exp")
    private String orgao_exp;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "profissao")
    private String profissao;

    @Column(name = "naciolnalidade")
    private String nacionalidade;

    @ManyToOne
    private Estado naturalidade;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "data_nasc")
    private String data_nasc;

    @Column(name = "idade")
    private int idade;

    @Column(name = "cnh")
    private String cnh;

    @Column(name = "validade_cnh")
    private String validade_cnh;

    public Envolvido() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
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

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public Veiculos getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculos veiculo) {
        this.veiculo = veiculo;
    }

    public PosicaoVeiculo getPosicao_veiculo() {
        return posicao_veiculo;
    }

    public void setPosicao_veiculo(PosicaoVeiculo posicao_veiculo) {
        this.posicao_veiculo = posicao_veiculo;
    }

    public CondicaoSeguranca getCondicao_seguranca() {
        return condicao_seguranca;
    }

    public void setCondicao_seguranca(CondicaoSeguranca condicao_seguranca) {
        this.condicao_seguranca = condicao_seguranca;
    }

    public Lesoes getLesao() {
        return lesao;
    }

    public void setLesao(Lesoes lesao) {
        this.lesao = lesao;
    }

    public LocalEncaminhado getLocal_encaminhado() {
        return local_encaminhado;
    }

    public void setLocal_encaminhado(LocalEncaminhado local_encaminhado) {
        this.local_encaminhado = local_encaminhado;
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

    public Estado getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(Estado naturalidade) {
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getValidade_cnh() {
        return validade_cnh;
    }

    public void setValidade_cnh(String validade_cnh) {
        this.validade_cnh = validade_cnh;
    }
}
