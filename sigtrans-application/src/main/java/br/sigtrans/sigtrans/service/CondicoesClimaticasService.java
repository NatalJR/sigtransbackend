package br.sigtrans.sigtrans.service;


import br.sigtrans.sigtrans.domain.Via.CondicoesClimaticas;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CondicoesClimaticasService extends GumgaService<CondicoesClimaticas, String> {

    @Autowired
    public CondicoesClimaticasService(GumgaCrudRepository<CondicoesClimaticas, String> repository) {
        super(repository);
    }

}