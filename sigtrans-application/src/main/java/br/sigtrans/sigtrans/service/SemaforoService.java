package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Semaforo;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SemaforoService extends GumgaService<Semaforo, String> {
    @Autowired
    public SemaforoService(GumgaCrudRepository<Semaforo, String> repository) {
        super(repository);
    }
}
