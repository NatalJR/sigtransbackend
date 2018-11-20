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
    private AnaliseObito analiseObito;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "ocorrencia_has_vitima", joinColumns =
            {@JoinColumn(name = "ocorrencia_id")}, inverseJoinColumns =
            {@JoinColumn(name = "vitima_id")})
    private Set<Vitima> envolvidos;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "ocorrencia_has_parceiro", joinColumns =
            {@JoinColumn(name = "ocorrencia_id")}, inverseJoinColumns =
            {@JoinColumn(name = "parceiro_id")})
    private Set<Parceiro> parceiros;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
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

    public Set<Vitima> getEnvolvidos() {
        return envolvidos;
    }

    public void setEnvolvidos(Set<Vitima> envolvidos) {
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
