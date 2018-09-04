package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Obitos.Especificacao;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EspecificacaoService extends GumgaService<Especificacao, String> {
    @Autowired
    public EspecificacaoService(GumgaCrudRepository<Especificacao, String> repository) {
        super(repository);
    }
}
