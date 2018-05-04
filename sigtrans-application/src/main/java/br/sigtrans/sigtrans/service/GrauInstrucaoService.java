package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.GrauInstrucao;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrauInstrucaoService extends GumgaService<GrauInstrucao, String> {
    @Autowired
    public GrauInstrucaoService(GumgaCrudRepository<GrauInstrucao, String> repository) {
        super(repository);
    }
}
