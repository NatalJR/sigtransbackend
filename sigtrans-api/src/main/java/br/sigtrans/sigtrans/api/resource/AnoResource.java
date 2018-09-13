package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Ano;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ano")
public class AnoResource extends GumgaAPI<Ano, String> {
    @Autowired
    public AnoResource(@Qualifier("anoService") GumgaService<Ano, String> service) {
        super(service);
    }
}