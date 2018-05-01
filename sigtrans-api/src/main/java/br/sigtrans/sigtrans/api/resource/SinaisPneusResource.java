package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.SinaisPneus;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sinaispneus")
public class SinaisPneusResource extends GumgaAPI<SinaisPneus, String> {
    @Autowired
    public SinaisPneusResource(@Qualifier("sinaisPneusService") GumgaService<SinaisPneus, String> service) {
        super(service);
    }
}
