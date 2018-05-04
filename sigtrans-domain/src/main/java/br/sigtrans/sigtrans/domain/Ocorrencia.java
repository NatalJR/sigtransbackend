package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Ocorrencia extends GumgaModelUUID {

    @OneToOne
    private DadosGerais dadosGerais;

    @OneToOne
    private DadosEstatisticos dadosEstatisticos;

    @ManyToMany
    private List<Envolvido> envolvidos;

    @ManyToMany
    private List<Parceiro> parceiros;

    @ManyToMany
    private List<Veiculo> veiculos;

    public Ocorrencia() {
    }

    public DadosGerais getDadosGerais() {
        return dadosGerais;
    }

    public void setDadosGerais(DadosGerais dadosGerais) {
        this.dadosGerais = dadosGerais;
    }

    public DadosEstatisticos getDadosEstatisticos() {
        return dadosEstatisticos;
    }

    public void setDadosEstatisticos(DadosEstatisticos dadosEstatisticos) {
        this.dadosEstatisticos = dadosEstatisticos;
    }

    public List<Envolvido> getEnvolvidos() {
        return envolvidos;
    }

    public void setEnvolvidos(List<Envolvido> envolvidos) {
        this.envolvidos = envolvidos;
    }

    public List<Parceiro> getParceiros() {
        return parceiros;
    }

    public void setParceiros(List<Parceiro> parceiros) {
        this.parceiros = parceiros;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
