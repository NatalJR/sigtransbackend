package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Via extends GumgaModelUUID {

    @Column(name = "faixas")
    private int faixas;

    @OneToMany
    private TipoVia tipoVia;

    @OneToMany
    private Pavimentacao pavimentacao;

    @OneToMany
    private ConservacaoVia conservacaoVia;

    @OneToMany
    private SentidoVia sentidoVia;

    @OneToMany
    private Semaforo semaforo;

    @OneToMany
    private PerfilPista perfilPista;

    @OneToMany
    private Superficie superficie;

    @OneToMany
    private EquipamentoControleTrafego equipamentoControleTrafego;

    @OneToMany
    private SeparacaoPista separacaoPista;

    @OneToMany
    private Visibilidade visibilidade;

    @OneToMany
    private Acostamento acostamento;

    @OneToMany
    private Sinalizacao sinalizacao;

    @OneToMany
    private SinaisPneus sinaisPneus;

    @Column(name = "velocidade_maxima")
    private int velocidadeMaxima;

    public Via() {
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
}
