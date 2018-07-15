package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.CondutasRisco;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;

public class CondutasRiscoService extends GumgaService<CondutasRisco, String> {
    @Autowired
    public CondutasRiscoService(GumgaCrudRepository<CondutasRisco, String> repository) {
        super(repository);
    }
}
