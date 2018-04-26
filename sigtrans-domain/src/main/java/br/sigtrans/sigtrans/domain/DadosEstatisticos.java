package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class DadosEstatisticos extends GumgaModelUUID {

    @Column(name = "zona")
    private String zona;

    //acidente trabalho

    @ManyToOne
    private TipoAcidente tipoAcidente;

    @ManyToOne
    private ClassificacaoAcidente classificacaoAcidente;

    @ManyToOne
    private CondicoesClimaticas condicaoClimatica;

    @ManyToOne
    private SentidoVia sentidoVia;

    @ManyToOne
    private ConservacaoVia conservacaoVia;

    @ManyToOne
    private Sinalizacao sinalizacao;

    @Column(name = "velocidade_maxima")
    private int velocidadeMaxima;

    @ManyToOne
    private Visibilidade visibilidade;

    @ManyToOne
    private PerfilPista perfilPista;

    @Column(name = "informacoes_aicionais")
    private String informacoesAdicionais;

    public DadosEstatisticos() {
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public TipoAcidente getTipoAcidente() {
        return tipoAcidente;
    }

    public void setTipoAcidente(TipoAcidente tipoAcidente) {
        this.tipoAcidente = tipoAcidente;
    }

    public ClassificacaoAcidente getClassificacaoAcidente() {
        return classificacaoAcidente;
    }

    public void setClassificacaoAcidente(ClassificacaoAcidente classificacaoAcidente) {
        this.classificacaoAcidente = classificacaoAcidente;
    }

    public CondicoesClimaticas getCondicaoClimatica() {
        return condicaoClimatica;
    }

    public void setCondicaoClimatica(CondicoesClimaticas condicaoClimatica) {
        this.condicaoClimatica = condicaoClimatica;
    }

    public SentidoVia getSentidoVia() {
        return sentidoVia;
    }

    public void setSentidoVia(SentidoVia sentidoVia) {
        this.sentidoVia = sentidoVia;
    }

    public ConservacaoVia getConservacaoVia() {
        return conservacaoVia;
    }

    public void setConservacaoVia(ConservacaoVia conservacaoVia) {
        this.conservacaoVia = conservacaoVia;
    }

    public Sinalizacao getSinalizacao() {
        return sinalizacao;
    }

    public void setSinalizacao(Sinalizacao sinalizacao) {
        this.sinalizacao = sinalizacao;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Visibilidade getVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(Visibilidade visibilidade) {
        this.visibilidade = visibilidade;
    }

    public PerfilPista getPerfilPista() {
        return perfilPista;
    }

    public void setPerfilPista(PerfilPista perfilPista) {
        this.perfilPista = perfilPista;
    }

    public String getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    public void setInformacoesAdicionais(String informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }
}
