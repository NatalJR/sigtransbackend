package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Obitos.FatoresRisco;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fatoresrisco")
public class FatoresRiscoResource extends GumgaAPI<FatoresRisco, String> {
    @Autowired
    public FatoresRiscoResource(@Qualifier("fatoresRiscoService") GumgaService<FatoresRisco, String> service) {
        super(service);
    }
}
