package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Lesoes;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LesoesService extends GumgaService<Lesoes, String> {
    @Autowired
    public LesoesService(GumgaCrudRepository<Lesoes, String> repository) {
        super(repository);
    }
}
