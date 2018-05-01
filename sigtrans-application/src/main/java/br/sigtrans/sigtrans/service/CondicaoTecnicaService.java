package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.CondicaoTecnica;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CondicaoTecnicaService extends GumgaService<CondicaoTecnica, String> {
    @Autowired
    public CondicaoTecnicaService(GumgaCrudRepository<CondicaoTecnica, String> repository) {
        super(repository);
    }
}