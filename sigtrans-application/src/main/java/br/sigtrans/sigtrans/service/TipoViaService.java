package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.TipoVia;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoViaService extends GumgaService<TipoVia, String> {
    @Autowired
    public TipoViaService(GumgaCrudRepository<TipoVia, String> repository) {
        super(repository);
    }
}
