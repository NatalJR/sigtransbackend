package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.TipoAcidente;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoAcidenteService extends GumgaService<TipoAcidente, String> {
    @Autowired
    public TipoAcidenteService(GumgaCrudRepository<TipoAcidente, String> repository) {
        super(repository);
    }
}