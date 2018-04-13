package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Visibilidade;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisibilidadeService extends GumgaService<Visibilidade, String> {
    @Autowired
    public VisibilidadeService(GumgaCrudRepository<Visibilidade, String> repository) {
        super(repository);
    }
}
