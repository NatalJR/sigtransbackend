package br.sigtrans.sigtrans.service;

import br.sigtrans.sigtrans.domain.Obitos.UsuarioContributivo;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioContributivoService extends GumgaService<UsuarioContributivo, String> {
    @Autowired
    public UsuarioContributivoService(GumgaCrudRepository<UsuarioContributivo, String> repository) {
        super(repository);
    }
}
