package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Ocorrencia.Profissao;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfissaoService extends GumgaService<Profissao, String> {
    @Autowired
    public ProfissaoService(GumgaCrudRepository<Profissao, String> repository) {
        super(repository);
    }
}
