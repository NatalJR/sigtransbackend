package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Bairro;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BairroService extends GumgaService<Bairro, String> {

    @Autowired
    public BairroService(GumgaCrudRepository<Bairro, String> repository) {
        super(repository);
    }

}