package br.sigtrans.sigtrans.domain.Ocorrencia;

import br.sigtrans.sigtrans.domain.Obitos.AnaliseObito;
import br.sigtrans.sigtrans.domain.Veiculo.Veiculo;
import io.gumga.domain.GumgaModelUUID;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Ocorrencia extends GumgaModelUUID {

    @Embedded
    private DadosGerais dadosGerais;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dadosestatisticos_id")
    private DadosEstatisticos dadosEstatisticos;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "analiseobito_id")
    private AnaliseObito analiseObito;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ocorrencia_has_envolvido", joinColumns =
            {@JoinColumn(name = "ocorrencia_id")}, inverseJoinColumns =
            {@JoinColumn(name = "envolvido_id")})
    private Set<Envolvido> envolvidos;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ocorrencia_has_parceiro", joinColumns =
            {@JoinColumn(name = "ocorrencia_id")}, inverseJoinColumns =
            {@JoinColumn(name = "parceiro_id")})
    private Set<Parceiro> parceiros;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ocorrencia_has_veiculo", joinColumns =
            {@JoinColumn(name = "ocorrencia_id")}, inverseJoinColumns =
            {@JoinColumn(name = "veiculo_id")})
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

    public AnaliseObito getAnaliseObito() {
        return analiseObito;
    }

    public void setAnaliseObito(AnaliseObito analiseObito) {
        this.analiseObito = analiseObito;
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
