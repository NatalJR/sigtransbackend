package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Obitos.UsuarioContributivo;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuariocontributivo")
public class UsuarioContributivoResource extends GumgaAPI<UsuarioContributivo, String> {
    @Autowired
    public UsuarioContributivoResource(@Qualifier("usuarioContributivoService") GumgaService<UsuarioContributivo, String> service) {
        super(service);
    }
}
