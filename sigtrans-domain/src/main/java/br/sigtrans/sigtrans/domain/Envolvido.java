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
    private String numero;

    @Column(name = "nome_mae")
    private String nomeMae;

    @ManyToOne
    private Veiculo veiculo;

    @ManyToOne
    private PosicaoVeiculo posicaoVeiculo;

    @ManyToOne
    private CondicaoSeguranca condicaoSeguranca;

    @ManyToOne
    private Lesoes lesao;

    @ManyToOne
    private LocalEncaminhado localEncaminhado;

    @Column(name = "documento") //RG
    private String documento;

    @Column(name = "orgao_exp")
    private String orgaoExp;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "profissao")
    private String profissao;

    @Column(name = "nacionalidade")
    private String nacionalidade;

    @ManyToOne
    private Estado naturalidade;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "data_nasc")
    private String dataNascimento;

    @Column(name = "idade")
    private int idade;

    @Column(name = "cnh")
    private String cnh;

    @Column(name = "validade_cnh")
    private String validadeCNH;

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

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public PosicaoVeiculo getPosicaoVeiculo() {
        return posicaoVeiculo;
    }

    public void setPosicaoVeiculo(PosicaoVeiculo posicaoVeiculo) {
        this.posicaoVeiculo = posicaoVeiculo;
    }

    public CondicaoSeguranca getCondicaoSeguranca() {
        return condicaoSeguranca;
    }

    public void setCondicaoSeguranca(CondicaoSeguranca condicaoSeguranca) {
        this.condicaoSeguranca = condicaoSeguranca;
    }

    public Lesoes getLesao() {
        return lesao;
    }

    public void setLesao(Lesoes lesao) {
        this.lesao = lesao;
    }

    public LocalEncaminhado getLocalEncaminhado() {
        return localEncaminhado;
    }

    public void setLocalEncaminhado(LocalEncaminhado localEncaminhado) {
        this.localEncaminhado = localEncaminhado;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public String getValidadeCNH() {
        return validadeCNH;
    }

    public void setValidadeCNH(String validadeCNH) {
        this.validadeCNH = validadeCNH;
    }
}
