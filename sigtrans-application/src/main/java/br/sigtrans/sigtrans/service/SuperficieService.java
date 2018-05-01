package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Superficie;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperficieService extends GumgaService<Superficie, String> {
    @Autowired
    public SuperficieService(GumgaCrudRepository<Superficie, String> repository) {
        super(repository);
    }
}
