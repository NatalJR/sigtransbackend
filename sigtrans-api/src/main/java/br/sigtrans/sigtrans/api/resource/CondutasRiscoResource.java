package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Obitos.CondutasRisco;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/condutasrisco")
public class CondutasRiscoResource extends GumgaAPI<CondutasRisco, String> {
    @Autowired
    public CondutasRiscoResource(@Qualifier("condutasRiscoService") GumgaService<CondutasRisco, String> service) {
        super(service);
    }
}
