package br.sigtrans.sigtrans.domain.Ocorrencia;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.util.Date;

@Embeddable
public class DadosGerais {

    private Date dataHora;
    private Date dataHoraSigtrans;
    private String pontoReferencia;
    private String numero;
    private Double latitude;
    private Double longitude;
    private String informacoesAdicionais;

    @Column(name = "rgoBombeiros", unique = true)
    private String rgoBombeiros;

    @Column(name = "protocoloBateu", unique = true)
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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
