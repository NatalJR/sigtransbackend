package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Obitos.CondutaRisco;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CondutaRiscoService extends GumgaService<CondutaRisco, String> {
    @Autowired
    public CondutaRiscoService(GumgaCrudRepository<CondutaRisco, String> repository) {
        super(repository);
    }
}
