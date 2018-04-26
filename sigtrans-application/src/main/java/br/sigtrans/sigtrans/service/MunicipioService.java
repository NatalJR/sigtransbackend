package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Municipio;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MunicipioService extends GumgaService<Municipio, String> {

    @Autowired
    public MunicipioService(GumgaCrudRepository<Municipio, String> repository) {
        super(repository);
    }

}