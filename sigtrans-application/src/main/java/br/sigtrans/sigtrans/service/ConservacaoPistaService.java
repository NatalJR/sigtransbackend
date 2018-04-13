package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.ConservacaoPista;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ConservacaoPistaService extends GumgaService<ConservacaoPista, String> {
    @Autowired
    public ConservacaoPistaService(GumgaCrudRepository<ConservacaoPista, String> repository) {
        super(repository);
    }
}
