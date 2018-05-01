package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.SinaisPneus;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SinaisPneusService extends GumgaService<SinaisPneus, String> {
    @Autowired
    public SinaisPneusService(GumgaCrudRepository<SinaisPneus, String> repository) {
        super(repository);
    }
}
