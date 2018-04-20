package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.ConservacaoVia;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConservacaoViaService extends GumgaService<ConservacaoVia, String> {
    @Autowired
    public ConservacaoViaService(GumgaCrudRepository<ConservacaoVia, String> repository) {
        super(repository);
    }
}
