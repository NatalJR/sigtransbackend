package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Envolvido;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnvolvidoService extends GumgaService<Envolvido, String> {
    @Autowired
    public EnvolvidoService(GumgaCrudRepository<Envolvido, String> repository) {
        super(repository);
    }
}
