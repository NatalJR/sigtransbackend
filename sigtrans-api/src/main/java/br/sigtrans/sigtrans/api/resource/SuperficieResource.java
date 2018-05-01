package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Superficie;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/superficie")
public class SuperficieResource extends GumgaAPI<Superficie, String> {
    @Autowired
    public SuperficieResource(@Qualifier("superficieService") GumgaService<Superficie, String> service) {
        super(service);
    }
}
