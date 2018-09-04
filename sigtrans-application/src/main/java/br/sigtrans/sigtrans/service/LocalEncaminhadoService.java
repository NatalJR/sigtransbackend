package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Ocorrencia.LocalEncaminhado;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalEncaminhadoService extends GumgaService<LocalEncaminhado, String> {
    @Autowired
    public LocalEncaminhadoService(GumgaCrudRepository<LocalEncaminhado, String> repository) {
        super(repository);
    }
}
