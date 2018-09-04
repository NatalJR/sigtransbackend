package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Obitos.FatoresGravidade;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FatoresGravidadeService extends GumgaService<FatoresGravidade, String> {
    @Autowired
    public FatoresGravidadeService(GumgaCrudRepository<FatoresGravidade, String> repository) {
        super(repository);
    }
}
