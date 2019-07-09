package br.sigtrans.sigtrans.domain.Ocorrencia;

import br.sigtrans.sigtrans.domain.Via.*;
import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Via extends GumgaModelUUID {

    @Column(name = "faixas")
    private int faixas;

    @Column(name = "velocidade_maxima")
    private int velocidadeMaxima;

    @ManyToOne
    private TipoVia tipoVia;

    @ManyToOne
    private Pavimentacao pavimentacao;

    @ManyToOne
    private ConservacaoVia conservacaoVia;

    @ManyToOne
    private SentidoVia sentidoVia;

    @ManyToOne
    private Semaforo semaforo;

    @ManyToOne
    private PerfilPista perfilPista;

    @ManyToOne
    private Superficie superficie;

    @ManyToOne
    private CondicoesClimaticas condicoesClimaticas;

    @ManyToOne
    private EquipamentoControleTrafego equipamentoControleTrafego;

    @ManyToOne
    private SeparacaoPista separacaoPista;

    @ManyToOne
    private Visibilidade visibilidade;

    @ManyToOne
    private CondicaoTecnica condicaoTecnica;

    @ManyToOne
    private Acostamento acostamento;

    @ManyToOne
    private Sinalizacao sinalizacao;

    @ManyToOne
    private SinaisPneus sinaisPneus;



    public Via() {
    }

    public CondicoesClimaticas getCondicoesClimaticas() {
        return condicoesClimaticas;
    }

    public void setCondicoesClimaticas(CondicoesClimaticas condicoesClimaticas) {
        this.condicoesClimaticas = condicoesClimaticas;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    public TipoVia getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(TipoVia tipoVia) {
        this.tipoVia = tipoVia;
    }

    public Pavimentacao getPavimentacao() {
        return pavimentacao;
    }

    public void setPavimentacao(Pavimentacao pavimentacao) {
        this.pavimentacao = pavimentacao;
    }

    public ConservacaoVia getConservacaoVia() {
        return conservacaoVia;
    }

    public void setConservacaoVia(ConservacaoVia conservacaoVia) {
        this.conservacaoVia = conservacaoVia;
    }

    public SentidoVia getSentidoVia() {
        return sentidoVia;
    }

    public void setSentidoVia(SentidoVia sentidoVia) {
        this.sentidoVia = sentidoVia;
    }

    public Semaforo getSemaforo() {
        return semaforo;
    }

    public void setSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    public PerfilPista getPerfilPista() {
        return perfilPista;
    }

    public void setPerfilPista(PerfilPista perfilPista) {
        this.perfilPista = perfilPista;
    }

    public Superficie getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Superficie superficie) {
        this.superficie = superficie;
    }

    public EquipamentoControleTrafego getEquipamentoControleTrafego() {
        return equipamentoControleTrafego;
    }

    public void setEquipamentoControleTrafego(EquipamentoControleTrafego equipamentoControleTrafego) {
        this.equipamentoControleTrafego = equipamentoControleTrafego;
    }

    public SeparacaoPista getSeparacaoPista() {
        return separacaoPista;
    }

    public void setSeparacaoPista(SeparacaoPista separacaoPista) {
        this.separacaoPista = separacaoPista;
    }

    public Visibilidade getVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(Visibilidade visibilidade) {
        this.visibilidade = visibilidade;
    }

    public Acostamento getAcostamento() {
        return acostamento;
    }

    public void setAcostamento(Acostamento acostamento) {
        this.acostamento = acostamento;
    }

    public Sinalizacao getSinalizacao() {
        return sinalizacao;
    }

    public void setSinalizacao(Sinalizacao sinalizacao) {
        this.sinalizacao = sinalizacao;
    }

    public SinaisPneus getSinaisPneus() {
        return sinaisPneus;
    }

    public void setSinaisPneus(SinaisPneus sinaisPneus) {
        this.sinaisPneus = sinaisPneus;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public CondicaoTecnica getCondicaoTecnica() {
        return condicaoTecnica;
    }

    public void setCondicaoTecnica(CondicaoTecnica condicaoTecnica) {
        this.condicaoTecnica = condicaoTecnica;
    }
}
