package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Obitos.FatoresRisco;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FatoresRiscoService extends GumgaService<FatoresRisco, String> {
    @Autowired
    public FatoresRiscoService(GumgaCrudRepository<FatoresRisco, String> repository) {
        super(repository);
    }
}
