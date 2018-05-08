package br.sigtrans.sigtrans.domain;

import io.gumga.domain.GumgaModelUUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Ocorrencia extends GumgaModelUUID {

    @Embedded
    private DadosGerais dadosGerais;

    @Embedded
    private DadosEstatisticos dadosEstatisticos;

    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name = "ocorrencia_id")
    private Set<Envolvido> envolvidos;

    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name = "ocorrencia_id")
    private Set<Parceiro> parceiros;

    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name = "ocorrencia_id")
    private Set<Veiculo> veiculos;

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

    public Set<Envolvido> getEnvolvidos() {
        return envolvidos;
    }

    public void setEnvolvidos(Set<Envolvido> envolvidos) {
        this.envolvidos = envolvidos;
    }

    public Set<Parceiro> getParceiros() {
        return parceiros;
    }

    public void setParceiros(Set<Parceiro> parceiros) {
        this.parceiros = parceiros;
    }

    public Set<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Set<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
