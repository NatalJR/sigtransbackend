package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Ano;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnoService extends GumgaService<Ano, String> {
    @Autowired
    public AnoService(GumgaCrudRepository<Ano, String> repository) {
        super(repository);
    }
}
