package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Pavimentacao;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PavimentacaoService extends GumgaService<Pavimentacao, String> {
    @Autowired
    public PavimentacaoService(GumgaCrudRepository<Pavimentacao, String> repository) {
        super(repository);
    }
}
