package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.PerfilPista;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perfilpista")
public class PerfilPistaResource extends GumgaAPI<PerfilPista, String> {
    @Autowired
    public PerfilPistaResource(@Qualifier("perfilPistaService")GumgaService<PerfilPista, String> service) {
        super(service);
    }
}
