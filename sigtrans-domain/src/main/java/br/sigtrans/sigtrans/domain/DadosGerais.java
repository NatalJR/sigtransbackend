package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class DadosGerais extends GumgaModelUUID {

    @Column(name = "data")
    private Date data;

    @Column(name = "hora")
    private String hora;

    @Column(name = "data_sigtrans")
    private Date dataSigtrans;

    @Column(name = "hora_sigtrans")
    private String horaSigtrans;

    @ManyToOne
    private Estado estado;

    @ManyToOne
    private Municipio municipio;

    @ManyToOne
    private Bairro bairro;

    @ManyToOne
    private Rua rua;

    @ManyToOne
    private Rua cruzamento;

    @Column(name = "ponto_referencia")
    private String pontoReferencia;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "informacoes_adicionais")
    private String informacoesAdicionais;

    @Column(name = "rgo_bombeiros")
    private String rgoBombeiros;

    @Column(name = "protocolo_bateu")
    private String protocoloBateu;

    public DadosGerais() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Date getDataSigtrans() {
        return dataSigtrans;
    }

    public void setDataSigtrans(Date dataSigtrans) {
        this.dataSigtrans = dataSigtrans;
    }

    public String getHoraSigtrans() {
        return horaSigtrans;
    }

    public void setHoraSigtrans(String horaSigtrans) {
        this.horaSigtrans = horaSigtrans;
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

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Rua getRua() {
        return rua;
    }

    public void setRua(Rua rua) {
        this.rua = rua;
    }

    public Rua getCurzamento() {
        return cruzamento;
    }

    public void setCurzamento(Rua cruzamento) {
        this.cruzamento = cruzamento;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
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

    public Rua getCruzamento() {
        return cruzamento;
    }

    public void setCruzamento(Rua cruzamento) {
        this.cruzamento = cruzamento;
    }

    public String getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    public void setInformacoesAdicionais(String informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }

    public String getRgoBombeiros() {
        return rgoBombeiros;
    }

    public void setRgoBombeiros(String rgoBombeiros) {
        this.rgoBombeiros = rgoBombeiros;
    }

    public String getProtocoloBateu() {
        return protocoloBateu;
    }

    public void setProtocoloBateu(String protocoloBateu) {
        this.protocoloBateu = protocoloBateu;
    }
}
