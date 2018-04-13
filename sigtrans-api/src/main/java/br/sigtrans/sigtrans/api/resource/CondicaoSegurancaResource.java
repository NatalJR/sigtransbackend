package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.CondicaoSeguranca;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/condicaoseguranca")
public class CondicaoSegurancaResource extends GumgaAPI<CondicaoSeguranca, String> {
    @Autowired
    public CondicaoSegurancaResource(@Qualifier("condicaoSegurancaService") GumgaService<CondicaoSeguranca, String> service) {
        super(service);
    }
}
