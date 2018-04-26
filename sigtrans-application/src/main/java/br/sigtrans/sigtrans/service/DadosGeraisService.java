package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.DadosGerais;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadosGeraisService extends GumgaService<DadosGerais, String> {
    @Autowired
    public DadosGeraisService(GumgaCrudRepository<DadosGerais, String> repository) {
        super(repository);
    }
}
