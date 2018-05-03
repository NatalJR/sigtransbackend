package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Via;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/via")
public class ViaResource extends GumgaAPI<Via, String> {
    @Autowired
    public ViaResource(@Qualifier("viaService") GumgaService<Via, String> service) {
        super(service);
    }
}
