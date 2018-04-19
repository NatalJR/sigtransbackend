package br.sigtrans.sigtrans.domain;

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
    private Cidade cidade;

    @Column(name = "nome_contato")
    private String nome_contato;

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

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNome_contato() {
        return nome_contato;
    }

    public void setNome_contato(String nome_contato) {
        this.nome_contato = nome_contato;
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
