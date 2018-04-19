package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.LocalEncaminhado;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/localencaminhado")
public class LocalEncaminhadoResource extends GumgaAPI<LocalEncaminhado, String> {

    @Autowired
    public LocalEncaminhadoResource(@Qualifier("localEncaminhadoService") GumgaService<LocalEncaminhado, String> service) {
        super(service);
    }
}
