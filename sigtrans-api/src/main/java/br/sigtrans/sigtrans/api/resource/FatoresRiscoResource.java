package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Obitos.FatorRisco;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fatorrisco")
public class FatoresRiscoResource extends GumgaAPI<FatorRisco, String> {
    @Autowired
    public FatoresRiscoResource(@Qualifier("fatorRiscoService") GumgaService<FatorRisco, String> service) {
        super(service);
    }
}
