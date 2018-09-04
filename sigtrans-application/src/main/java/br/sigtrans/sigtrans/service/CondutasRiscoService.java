package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Obitos.CondutasRisco;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CondutasRiscoService extends GumgaService<CondutasRisco, String> {
    @Autowired
    public CondutasRiscoService(GumgaCrudRepository<CondutasRisco, String> repository) {
        super(repository);
    }
}
