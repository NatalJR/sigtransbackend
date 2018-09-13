package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Obitos.FatorGravidade;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fatorgravidade")
public class FatoresGravidadeResource extends GumgaAPI<FatorGravidade, String> {
    @Autowired
    public FatoresGravidadeResource(@Qualifier("fatorGravidadeService") GumgaService<FatorGravidade, String> service) {
        super(service);
    }
}
