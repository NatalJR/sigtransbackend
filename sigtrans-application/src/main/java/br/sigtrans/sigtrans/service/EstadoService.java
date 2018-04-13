package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Estado;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoService extends GumgaService<Estado, String> {

    @Autowired
    public EstadoService(GumgaCrudRepository<Estado, String> repository) {
        super(repository);
    }

}