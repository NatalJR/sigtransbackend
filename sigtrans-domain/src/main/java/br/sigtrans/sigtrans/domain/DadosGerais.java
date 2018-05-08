package br.sigtrans.sigtrans.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.util.Date;

@Embeddable
public class DadosGerais {

    private Date dataHora;
    private Date dataHoraSigtrans;
    //    private String hora;
//    private String horaSigtrans;
    private String pontoReferencia;

    //    Não precisa ser BigDecimal
    private Double latitude;
    private Double longitude;

    private String informacoesAdicionais;
    private String rgoBombeiros;
    private String protocoloBateu;

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

    public DadosGerais() {
    }

    public DadosGerais(Date dataHora, Date dataHoraSigtrans, String pontoReferencia, Double latitude, Double longitude, String informacoesAdicionais, String rgoBombeiros, String protocoloBateu, Estado estado, Municipio municipio, Bairro bairro, Rua rua, Rua cruzamento) {
        this.dataHora = dataHora;
        this.dataHoraSigtrans = dataHoraSigtrans;
        this.pontoReferencia = pontoReferencia;
        this.latitude = latitude;
        this.longitude = longitude;
        this.informacoesAdicionais = informacoesAdicionais;
        this.rgoBombeiros = rgoBombeiros;
        this.protocoloBateu = protocoloBateu;
        this.estado = estado;
        this.municipio = municipio;
        this.bairro = bairro;
        this.rua = rua;
        this.cruzamento = cruzamento;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Date getDataHoraSigtrans() {
        return dataHoraSigtrans;
    }

    public void setDataHoraSigtrans(Date dataHoraSigtrans) {
        this.dataHoraSigtrans = dataHoraSigtrans;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
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

    public Rua getCruzamento() {
        return cruzamento;
    }

    public void setCruzamento(Rua cruzamento) {
        this.cruzamento = cruzamento;
    }
}
