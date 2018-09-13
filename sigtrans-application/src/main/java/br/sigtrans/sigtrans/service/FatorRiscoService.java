package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Obitos.FatorRisco;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FatorRiscoService extends GumgaService<FatorRisco, String> {
    @Autowired
    public FatorRiscoService(GumgaCrudRepository<FatorRisco, String> repository) {
        super(repository);
    }
}
