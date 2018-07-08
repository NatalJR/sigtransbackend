package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Bairro;
import br.sigtrans.sigtrans.repository.BairroRepository;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BairroService extends GumgaService<Bairro, String> {

    @Autowired
    public BairroService(GumgaCrudRepository<Bairro, String> repository) {
        super(repository);
    }

    public List<Bairro> buscarBairroPorNome(String nome, String municipioId) {
//        GumgaOi oi = new GumgaOi((GumgaThreadScope.organizationCode.get()+"%"));
        List<Bairro> Bairros = ((BairroRepository) repository).buscaBairroPorNome(nome + "%", municipioId + "%");

        System.out.println(Bairros);

        return Bairros;

    }
}