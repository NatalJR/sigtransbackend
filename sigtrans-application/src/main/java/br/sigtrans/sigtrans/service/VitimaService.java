package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Vitima;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VitimaService extends GumgaService<Vitima, String> {
    @Autowired
    public VitimaService(GumgaCrudRepository<Vitima, String> repository) {
        super(repository);
    }
}
