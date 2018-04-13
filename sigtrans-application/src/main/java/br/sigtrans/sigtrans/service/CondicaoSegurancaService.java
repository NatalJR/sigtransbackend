package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.CondicaoSeguranca;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CondicaoSegurancaService extends GumgaService<CondicaoSeguranca, String> {
    @Autowired
    public CondicaoSegurancaService(GumgaCrudRepository<CondicaoSeguranca, String> repository) {
        super(repository);
    }
}
