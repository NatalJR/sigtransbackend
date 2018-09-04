package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Ocorrencia.SeparacaoPista;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeparacaoPistaService extends GumgaService<SeparacaoPista, String> {
    @Autowired
    public SeparacaoPistaService(GumgaCrudRepository<SeparacaoPista, String> repository) {
        super(repository);
    }
}
