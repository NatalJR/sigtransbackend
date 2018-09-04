package br.sigtrans.sigtrans.domain.Ocorrencia;

import io.gumga.domain.GumgaModelUUID;
import io.gumga.domain.domains.GumgaEMail;
import io.gumga.domain.domains.GumgaPhoneNumber;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Parceiro extends GumgaModelUUID {

    @Column(name = "nome_parceiro")
    private String nome;

    @ManyToOne
    private Estado estado;

    @ManyToOne
    private Municipio municipio;

    @Column(name = "nome_contato")
    private String nomeContato;

    @Column(name = "telefone_contato")
    private GumgaPhoneNumber telefone;

    @Column(name = "email")
    private GumgaEMail email;

    public Parceiro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public GumgaPhoneNumber getTelefone() {
        return telefone;
    }

    public void setTelefone(GumgaPhoneNumber telefone) {
        this.telefone = telefone;
    }

    public GumgaEMail getEmail() {
        return email;
    }

    public void setEmail(GumgaEMail email) {
        this.email = email;
    }
}
