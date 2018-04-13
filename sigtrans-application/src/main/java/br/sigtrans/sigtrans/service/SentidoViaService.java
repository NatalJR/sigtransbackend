package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.SentidoVia;
import io.gumga.application.GumgaService;
import io.gumga.domain.GumgaRepository;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentidoViaService extends GumgaService<SentidoVia, String> {

     @Autowired
    public SentidoViaService(GumgaCrudRepository<SentidoVia, String> repository){
        super(repository);
    }
}
