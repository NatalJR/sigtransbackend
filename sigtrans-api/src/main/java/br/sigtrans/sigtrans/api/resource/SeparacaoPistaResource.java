package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.SeparacaoPista;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/separacaopista")
public class SeparacaoPistaResource extends GumgaAPI<SeparacaoPista, String> {
    @Autowired
    public SeparacaoPistaResource(@Qualifier("separacaoPistaService") GumgaService<SeparacaoPista, String> service) {
        super(service);
    }
}
