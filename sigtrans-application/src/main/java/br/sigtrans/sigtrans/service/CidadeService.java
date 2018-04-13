package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Cidade;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CidadeService extends GumgaService<Cidade, String> {

    @Autowired
    public CidadeService(GumgaCrudRepository<Cidade, String> repository) {
        super(repository);
    }

}