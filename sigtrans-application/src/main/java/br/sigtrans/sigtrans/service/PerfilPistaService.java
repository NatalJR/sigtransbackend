package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.PerfilPista;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilPistaService extends GumgaService<PerfilPista, String> {
    @Autowired
    public PerfilPistaService(GumgaCrudRepository<PerfilPista, String> repository) {
        super(repository);
    }
}
