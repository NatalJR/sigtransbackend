package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Municipio;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/municipio")
public class MunicipioResource extends GumgaAPI<Municipio, String> {
    @Autowired
    public MunicipioResource(@Qualifier("municipioService") GumgaService<Municipio, String> service) {
        super(service);
    }
}
