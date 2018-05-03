package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Ocorrencia;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OcorrenciaService extends GumgaService<Ocorrencia, String> {
    @Autowired
    public OcorrenciaService(GumgaCrudRepository<Ocorrencia, String> repository) {
        super(repository);
    }
}
