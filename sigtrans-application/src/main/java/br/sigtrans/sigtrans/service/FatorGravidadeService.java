package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Obitos.FatorGravidade;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FatorGravidadeService extends GumgaService<FatorGravidade, String> {
    @Autowired
    public FatorGravidadeService(GumgaCrudRepository<FatorGravidade, String> repository) {
        super(repository);
    }
}
