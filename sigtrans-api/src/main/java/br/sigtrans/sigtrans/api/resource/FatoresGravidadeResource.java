package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Obitos.FatoresGravidade;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fatoresgravidade")
public class FatoresGravidadeResource extends GumgaAPI<FatoresGravidade, String> {
    @Autowired
    public FatoresGravidadeResource(@Qualifier("fatoresGravidadeService") GumgaService<FatoresGravidade, String> service) {
        super(service);
    }
}
